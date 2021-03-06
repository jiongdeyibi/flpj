/**
 *
 */
package com.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.dd.util.ExportExcel;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * 控制器基类
 *
 * @author ghost
 * @version 2018年3月12日 下午3:47:58
 */
public abstract class BaseController {
    protected final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * 用于给导出excel表中的第一列设置编号
     */
    protected static Integer EXCEL_INDEX;

    /**
     * 设置成功响应代码
     */
    protected ResponseEntity<ModelMap> setSuccessModelMap(ModelMap modelMap) {
        return setSuccessModelMap(modelMap, null);
    }

    /**
     * 设置成功响应代码
     */
    protected ResponseEntity<ModelMap> setSuccessModelMap(ModelMap modelMap, Object data) {
        return setModelMap(modelMap, HttpCode.OK, data);
    }

    /**
     * 设置成功响应代码
     */
    protected ResponseEntity<ModelMap> setSuccessModelMap(ModelMap modelMap, Object data, Object dicts) {
        return setModelMap(modelMap, HttpCode.OK, data, dicts);
    }

    /**
     * 设置响应代码
     */
    protected ResponseEntity<ModelMap> setModelMap(ModelMap modelMap, HttpCode code) {
        return setModelMap(modelMap, code, null);
    }

    /**
     * 设置响应代码
     */
    protected ResponseEntity<ModelMap> setModelMap(ModelMap modelMap, HttpCode code, Object data) {
        return setModelMap(modelMap, code, data, null);
    }

    /**
     * 设置响应代码
     */
    protected ResponseEntity<ModelMap> setModelMap(ModelMap modelMap, HttpCode code, Object data, Object dicts) {
        modelMap.remove("void");
        if (data != null) {
            modelMap.put("data", data);
        }
        if (dicts != null) {
            modelMap.put("dicts", dicts);
        }
        modelMap.put("httpCode", code.value());
        modelMap.put("msg", code.msg());
        modelMap.put("timestamp", System.currentTimeMillis());
        return ResponseEntity.ok(modelMap);
    }

    protected Map<String, Map<String, String>> addDict(Map<String, Map<String, String>> dicts, String dictIndex, Map<String, String> dict) {
        dicts.put(dictIndex, dict);
        return dicts;
    }

    /**
     * 异常处理
     */
    @ExceptionHandler(Exception.class)
    public void exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception ex) throws Exception {
        logger.error(Constants.Exception_Head, ex);
        ModelMap modelMap = new ModelMap();
        if (ex instanceof BaseException) {
            ((BaseException) ex).handler(modelMap);
        } else if (ex instanceof IllegalArgumentException) {
            new IllegalParameterException(ex.getMessage()).handler(modelMap);
        } else {
            //用回车键来分隔几个元素
            String msg = ex.getMessage();
            String line = StringUtils.substringBefore(msg, "\n");
            String classN = StringUtils.substringBefore(line, ":");
            String text = StringUtils.substringAfter(line, ":");
            if (classN.equals(IllegalParameterException.class.getCanonicalName())) {
                new IllegalParameterException(text).handler(modelMap);
            } else if (classN.equals(NullPointerException.class.getCanonicalName())) {
                new IllegalParameterException("服务调用发生空指针异常").handler(modelMap);
            } else {
                setModelMap(modelMap, HttpCode.INTERNAL_SERVER_ERROR);
            }
        }
        request.setAttribute("msg", modelMap.get("msg"));
        response.setContentType("application/json;charset=UTF-8");
        byte[] bytes = JSON.toJSONBytes(modelMap, SerializerFeature.DisableCircularReferenceDetect);
        response.getOutputStream().write(bytes);
    }

    /**
     * 设置响应头
     *
     * @param response
     * @param excelName 设置导出文件名
     */
    public void setResponse(HttpServletResponse response, String excelName) {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/ms-excel");
        try {
            response.addHeader("Content-Disposition", "attachment;filename*=utf-8'zh_cn'" + URLEncoder.encode(excelName, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /**
     * 执行导出流
     *
     * @param response
     * @param ex           导出模板
     * @param excelTitle   导出sheet页名
     * @param excelHeaders 导出列头名
     * @param list         导出的数据
     */
    public void excuResponse(HttpServletResponse response, ExportExcel ex, String excelTitle, String[] excelHeaders, List list) {
        try {
            OutputStream out = response.getOutputStream();
            ex.exportExcel(excelTitle, excelHeaders, list, out);
            out.flush();
            out.close();
        } catch (Exception e) {
        }
    }
}
