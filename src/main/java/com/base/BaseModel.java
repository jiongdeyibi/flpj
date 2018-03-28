package com.base;

import java.io.Serializable;

public class BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String files;

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }
}