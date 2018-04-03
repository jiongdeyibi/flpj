package com.dd.entity;

import java.math.BigDecimal;

public class BrokerList {
    private String serialNo;
    private String companyName;
    private String year;
    private String scorePromit;
    private BigDecimal scoreValue;
    private String pulishOrgan;
    private String remark;
    private String orgRemark;
    private String punishObj;
    private String scoreFlag;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getScorePromit() {
        return scorePromit;
    }

    public void setScorePromit(String scorePromit) {
        this.scorePromit = scorePromit;
    }

    public BigDecimal getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(BigDecimal scoreValue) {
        this.scoreValue = scoreValue;
    }

    public String getPulishOrgan() {
        return pulishOrgan;
    }

    public void setPulishOrgan(String pulishOrgan) {
        this.pulishOrgan = pulishOrgan;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrgRemark() {
        return orgRemark;
    }

    public void setOrgRemark(String orgRemark) {
        this.orgRemark = orgRemark;
    }

    public String getPunishObj() {
        return punishObj;
    }

    public void setPunishObj(String punishObj) {
        this.punishObj = punishObj;
    }

    public String getScoreFlag() {
        return scoreFlag;
    }

    public void setScoreFlag(String scoreFlag) {
        this.scoreFlag = scoreFlag;
    }

    @Override
    public String toString() {
        return "BrokerList{" +
                "serialNo='" + serialNo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", year='" + year + '\'' +
                ", scorePromit='" + scorePromit + '\'' +
                ", scoreValue=" + scoreValue +
                ", pulishOrgan='" + pulishOrgan + '\'' +
                ", remark='" + remark + '\'' +
                ", orgRemark='" + orgRemark + '\'' +
                ", punishObj='" + punishObj + '\'' +
                ", scoreFlag='" + scoreFlag + '\'' +
                '}';
    }
}
