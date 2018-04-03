package com.dd.entity;

import com.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class PjScore extends BaseModel {
    private String scoreId;

    private String scorePromit;

    private String objectKind;

    private BigDecimal scoreValue;

    private String pulishOrgan;

    private String lastModifiedBy;

    private Date lastModifiedAt;

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId == null ? null : scoreId.trim();
    }

    public String getScorePromit() {
        return scorePromit;
    }

    public void setScorePromit(String scorePromit) {
        this.scorePromit = scorePromit == null ? null : scorePromit.trim();
    }

    public String getObjectKind() {
        return objectKind;
    }

    public void setObjectKind(String objectKind) {
        this.objectKind = objectKind == null ? null : objectKind.trim();
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
        this.pulishOrgan = pulishOrgan == null ? null : pulishOrgan.trim();
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

    @Override
    public String toString() {
        return "PjScore{" +
                "scoreId='" + scoreId + '\'' +
                ", scorePromit='" + scorePromit + '\'' +
                ", objectKind='" + objectKind + '\'' +
                ", scoreValue=" + scoreValue +
                ", pulishOrgan='" + pulishOrgan + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedAt=" + lastModifiedAt +
                '}';
    }
}