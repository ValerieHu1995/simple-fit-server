package com.zju.cst.simplefitserver.common;

import java.io.Serializable;

public class ResponseInfo implements Serializable {


    private String resCode;
    private String resInfo;
    private Object resObject;
    private Object[] resDataSet;

    public Object getResObject() {
        return resObject;
    }

    public void setResObject(Object resObject) {
        this.resObject = resObject;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResInfo() {
        return resInfo;
    }

    public void setResInfo(String resInfo) {
        this.resInfo = resInfo;
    }

    public Object[] getResDataSet() {
        return resDataSet;
    }

    public void setResDataSet(Object[] resDataSet) {
        this.resDataSet = resDataSet;
    }
}
