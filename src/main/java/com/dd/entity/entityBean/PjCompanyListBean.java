package com.dd.entity.entityBean;

import com.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class PjCompanyListBean extends BaseModel {
    private String year;

    private String listId;

    private String companyId;

    private String companyName;

    private BigDecimal scoreValue;

    private BigDecimal listValue;

    private String lastModifiedBy;

    private Date lastModifiedAt;

    private BigDecimal listValue1;

    private BigDecimal listValue2;

    private BigDecimal listValue3;

    private BigDecimal scoreValue1;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(BigDecimal scoreValue) {
        this.scoreValue = scoreValue;
    }

    public BigDecimal getListValue() {
        return listValue;
    }

    public void setListValue(BigDecimal listValue) {
        this.listValue = listValue;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public BigDecimal getListValue1() {
        return listValue1;
    }

    public void setListValue1(BigDecimal listValue1) {
        this.listValue1 = listValue1;
    }

    public BigDecimal getListValue2() {
        return listValue2;
    }

    public void setListValue2(BigDecimal listValue2) {
        this.listValue2 = listValue2;
    }

    public BigDecimal getListValue3() {
        return listValue3;
    }

    public void setListValue3(BigDecimal listValue3) {
        this.listValue3 = listValue3;
    }

    public BigDecimal getScoreValue1() {
        return scoreValue1;
    }

    public void setScoreValue1(BigDecimal scoreValue1) {
        this.scoreValue1 = scoreValue1;
    }

    @Override
    public String toString() {
        return "PjCompanyListBean{" +
                "year='" + year + '\'' +
                ", listId='" + listId + '\'' +
                ", companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", scoreValue=" + scoreValue +
                ", listValue=" + listValue +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedAt=" + lastModifiedAt +
                ", listValue1=" + listValue1 +
                ", listValue2=" + listValue2 +
                ", listValue3=" + listValue3 +
                ", scoreValue1=" + scoreValue1 +
                '}';
    }
}