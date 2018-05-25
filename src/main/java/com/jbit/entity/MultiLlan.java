package com.jbit.entity;

public class MultiLlan {
    private String elementId;

    private String pagePath;

    private String scn;

    private String tcn;

    private String en;

    private String jp;

    private String kr;

    private String fr;

    private String ra;

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId == null ? null : elementId.trim();
    }

    public String getPagePath() {
        return pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath == null ? null : pagePath.trim();
    }

    public String getScn() {
        return scn;
    }

    public void setScn(String scn) {
        this.scn = scn == null ? null : scn.trim();
    }

    public String getTcn() {
        return tcn;
    }

    public void setTcn(String tcn) {
        this.tcn = tcn == null ? null : tcn.trim();
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en == null ? null : en.trim();
    }

    public String getJp() {
        return jp;
    }

    public void setJp(String jp) {
        this.jp = jp == null ? null : jp.trim();
    }

    public String getKr() {
        return kr;
    }

    public void setKr(String kr) {
        this.kr = kr == null ? null : kr.trim();
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr == null ? null : fr.trim();
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra == null ? null : ra.trim();
    }
}