package com.dd.entity;

import com.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class PjList extends BaseModel {
    private String year;

    private String listId;

    private String listName;

    private BigDecimal workFlag;

    private String lastModifiedBy;

    private Date lastModifiedAt;

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

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public BigDecimal getWorkFlag() {
        return workFlag;
    }

    public void setWorkFlag(BigDecimal workFlag) {
        this.workFlag = workFlag;
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

    @Override
    public String toString() {
        return "PjList{" +
                "year='" + year + '\'' +
                ", listId='" + listId + '\'' +
                ", listName='" + listName + '\'' +
                ", workFlag=" + workFlag +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedAt=" + lastModifiedAt +
                '}';
    }
}