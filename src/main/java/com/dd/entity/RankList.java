package com.dd.entity;

import java.math.BigDecimal;

public class RankList {
    private String companyId;
    private String companyName;
    private BigDecimal listValue;
    private BigDecimal scoreValue;

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

    public BigDecimal getListValue() {
        return listValue;
    }

    public void setListValue(BigDecimal listValue) {
        this.listValue = listValue;
    }

    public BigDecimal getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(BigDecimal scoreValue) {
        this.scoreValue = scoreValue;
    }

    @Override
    public String toString() {
        return "RankList{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", listValue=" + listValue +
                ", scoreValue=" + scoreValue +
                '}';
    }
}
