package com.dd.entity;

import com.base.BaseModel;

public class Dict extends BaseModel {
    private Object id;

    private Object dictType;

    private Object dictName;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getDictType() {
        return dictType;
    }

    public void setDictType(Object dictType) {
        this.dictType = dictType;
    }

    public Object getDictName() {
        return dictName;
    }

    public void setDictName(Object dictName) {
        this.dictName = dictName;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", dictType=" + dictType +
                ", dictName=" + dictName +
                '}';
    }
}