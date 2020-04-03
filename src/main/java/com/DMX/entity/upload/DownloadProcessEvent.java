package com.DMX.entity.upload;
/*
 *    Copyright 2018, Haifan Data
 *
 *    author: zhouyong
 *    date: 2019/01/07
 */

public class DownloadProcessEvent {
    public static final String ACTION_DOWNLOADING = "downloading";
    public static final String ACTION_VERIFY_MD5 = "md5";
    public static final String ACTION_COPYING = "copying";

    private int total;
    private int currentIndex;
    private int currentProcess;
    private String currentFileName;
    private String planId;
    private String scriptId;
    private String currentId;
    //action can be downloading,md5
    private String action;

    public DownloadProcessEvent(String fileName,int process,String action,int total,int currentIndex,String currentId,
                                String scriptId,String planId) {
        this.currentFileName = fileName;
        this.currentProcess = process;
        this.action = action;
        this.total = total;
        this.currentIndex = currentIndex;
        this.currentId = currentId;
        this.scriptId = scriptId;
        this.planId = planId;
    }

    public int getProcess() {
        return currentProcess;
    }

    public void setProcess(int process) {
        this.currentProcess = process;
    }

    public String getCurrentFileName() {
        return currentFileName;
    }

    public void setCurrentFileName(String currentFileName) {
        this.currentFileName = currentFileName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public String getCurrentId() {
        return currentId;
    }

    public void setCurrentId(String currentId) {
        this.currentId = currentId;
    }

    public int getCurrentProcess() {
        return currentProcess;
    }

    public void setCurrentProcess(int currentProcess) {
        this.currentProcess = currentProcess;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }
}
