package com.DMX.model;

/**
 * 正在播放的节目
 * @author  anonymous
 *
 */
public class PlayingScriptInfo {

    /**
     * 正在播放的节目信息,全局存储一份
     */
    private static PlayingScriptInfo instance;

    public static PlayingScriptInfo getInstance() {
        if (null == instance) {
            instance = new PlayingScriptInfo();
        }
        return instance;
    }

    public static final String ACTION_DOWNLOADING = "downloading";
    public static final String ACTION_VERIFY_MD5 = "md5";
    public static final String ACTION_COPYING = "copying";
    
    private int times;//播放次数
    private int total;
    private int currentIndex;
    private int currentProcess;
    private String currentFileName;
    /**
     * 计划id
     */
    private String planId;
    /**
     * 节目id
     */
    private String scriptId;
    /**
     * 素材id
     */
    private String currentId;
    //action can be downloading,md5
    private String action;

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

    public int getCurrentProcess() {
        return currentProcess;
    }

    public void setCurrentProcess(int currentProcess) {
        this.currentProcess = currentProcess;
    }

    public String getCurrentFileName() {
        return currentFileName;
    }

    public void setCurrentFileName(String currentFileName) {
        this.currentFileName = currentFileName;
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

    public String getCurrentId() {
        return currentId;
    }

    public void setCurrentId(String currentId) {
        this.currentId = currentId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

	/**
	
	 * @return the times  
	
	 */
	public int getTimes() {
		return times;
	}

	/**
	
	 * @param times the times to set  
	
	 */
	public void setTimes(int times) {
		this.times = times;
	}
}
