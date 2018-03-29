package com.dd.entity.entityBean;

import java.math.BigDecimal;

public class RankListBean {
    private String companyId;
    private String companyName;
    private BigDecimal listValue;
    private BigDecimal listValueMultiple;
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

    public BigDecimal getListValueMultiple() {
        return listValueMultiple;
    }

    public void setListValueMultiple(BigDecimal listValueMultiple) {
        this.listValueMultiple = listValueMultiple.divide(new BigDecimal(20000), 0, BigDecimal.ROUND_HALF_DOWN);
    }

    @Override
    public String toString() {
        return "RankListBean{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", listValue=" + listValue +
                ", listValueMultiple=" + listValueMultiple +
                ", scoreValue=" + scoreValue +
                '}';
    }
}
