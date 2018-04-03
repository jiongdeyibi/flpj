package com.dd.entity;

import com.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class PjCompanyScore extends BaseModel {
    private String serialNo;

    private String year;

    private String companyId;

    private String scoreId;

    private BigDecimal scoreValue;

    private String lastModifiedBy;

    private Date lastModifiedAt;

    private String orgRemark;

    private String punishObj;

    private String scoreFlag;

    private String title;

    private String punishType;

    private String linkAddress;

    private String remark;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId == null ? null : scoreId.trim();
    }

    public BigDecimal getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(BigDecimal scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy == null ? null : lastModifiedBy.trim();
    }

    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public String getOrgRemark() {
        return orgRemark;
    }

    public void setOrgRemark(String orgRemark) {
        this.orgRemark = orgRemark == null ? null : orgRemark.trim();
    }

    public String getPunishObj() {
        return punishObj;
    }

    public void setPunishObj(String punishObj) {
        this.punishObj = punishObj == null ? null : punishObj.trim();
    }

    public String getScoreFlag() {
        return scoreFlag;
    }

    public void setScoreFlag(String scoreFlag) {
        this.scoreFlag = scoreFlag == null ? null : scoreFlag.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getPunishType() {
        return punishType;
    }

    public void setPunishType(String punishType) {
        this.punishType = punishType == null ? null : punishType.trim();
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress == null ? null : linkAddress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "PjCompanyScore{" +
                "serialNo='" + serialNo + '\'' +
                ", year='" + year + '\'' +
                ", companyId='" + companyId + '\'' +
                ", scoreId='" + scoreId + '\'' +
                ", scoreValue=" + scoreValue +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedAt=" + lastModifiedAt +
                ", orgRemark='" + orgRemark + '\'' +
                ", punishObj='" + punishObj + '\'' +
                ", scoreFlag='" + scoreFlag + '\'' +
                ", title='" + title + '\'' +
                ", punishType='" + punishType + '\'' +
                ", linkAddress='" + linkAddress + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}