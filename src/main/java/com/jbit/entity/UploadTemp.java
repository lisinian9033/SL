package com.jbit.entity;

public class UploadTemp {
    private String uploader;

    private String uploadtype;

    private String uploadfilepath;

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    public String getUploadtype() {
        return uploadtype;
    }

    public void setUploadtype(String uploadtype) {
        this.uploadtype = uploadtype == null ? null : uploadtype.trim();
    }

    public String getUploadfilepath() {
        return uploadfilepath;
    }

    public void setUploadfilepath(String uploadfilepath) {
        this.uploadfilepath = uploadfilepath == null ? null : uploadfilepath.trim();
    }
}