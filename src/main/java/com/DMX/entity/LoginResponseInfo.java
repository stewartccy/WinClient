package com.DMX.entity;

public class LoginResponseInfo {
    private String time;
    private String baseUrl;
    private FtpInfo masterFtp;
    private FtpInfo slaveFtp;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public FtpInfo getMasterFtp() {
        return masterFtp;
    }

    public void setMasterFtp(FtpInfo masterFtp) {
        this.masterFtp = masterFtp;
    }

    public FtpInfo getSlaveFtp() {
        return slaveFtp;
    }

    public void setSlaveFtp(FtpInfo slaveFtp) {
        this.slaveFtp = slaveFtp;
    }
}