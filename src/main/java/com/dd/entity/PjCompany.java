package com.dd.entity;

import com.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class PjCompany extends BaseModel {

    private String companyId;
    private String year;
    private String lastModifiedBy;
    private Date lastModifiedAt;
    private String companyName;
    private BigDecimal beginScore;
    private String companyLevel;

    public PjCompany(String companyId, String year) {
        this.companyId = companyId;
        this.year = year;
    }

    public PjCompany() {
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getBeginScore() {
        return beginScore;
    }

    public void setBeginScore(BigDecimal beginScore) {
        this.beginScore = beginScore;
    }

    public String getCompanyLevel() {
        return companyLevel;
    }

    public void setCompanyLevel(String companyLevel) {
        this.companyLevel = companyLevel;
    }

    @Override
    public String toString() {
        return "PjCompany{" +
                "companyId='" + companyId + '\'' +
                ", year='" + year + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedAt=" + lastModifiedAt +
                ", companyName='" + companyName + '\'' +
                ", beginScore=" + beginScore +
                ", companyLevel='" + companyLevel + '\'' +
                '}';
    }
}