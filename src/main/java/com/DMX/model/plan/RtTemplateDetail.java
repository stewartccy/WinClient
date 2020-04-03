package com.DMX.model.plan;

import java.util.List;

public class RtTemplateDetail extends RtBase {
    private String areaId;
    private String areaMediaType;
    private String areaName;
    private String templateId;
    private int left;
    private int top;
    private boolean coordinateProportion;
    private boolean proportion;
    private int width;
    private int height;
    private int levelIndex;
    private float transparency;
    private int playTimes;
    private int switchTime;
    private int playMode;
    private int manualSwitch;
    private long duration;
    private int realLeft;
    private int realTop;
    private int realWidth;
    private int realHeight;
    private int volume;
    private int limitMode;
    private List<RtMediaMaterial> mediaMaterialList;
    private RtExtendTimeInfo extendTimeInfo;
    private List<RtMediaMaterial> validMaterailList;
    private List<RtScript> scriptList;
    private String extends2;
    private String extends1;//理财 牌价 存贷款利率 排队都是html类型

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaMediaType() {
        return areaMediaType;
    }

    public void setAreaMediaType(String areaMediaType) {
        this.areaMediaType = areaMediaType;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public boolean isCoordinateProportion() {
        return coordinateProportion;
    }

    public void setCoordinateProportion(boolean coordinateProportion) {
        this.coordinateProportion = coordinateProportion;
    }

    public boolean isProportion() {
        return proportion;
    }

    public void setProportion(boolean proportion) {
        this.proportion = proportion;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLevelIndex() {
        return levelIndex;
    }

    public void setLevelIndex(int levelIndex) {
        this.levelIndex = levelIndex;
    }

    public float getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }

    public int getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(int playTimes) {
        this.playTimes = playTimes;
    }

    public int getSwitchTime() {
        return switchTime;
    }

    public void setSwitchTime(int switchTime) {
        this.switchTime = switchTime;
    }

    public int getPlayMode() {
        return playMode;
    }

    public void setPlayMode(int playMode) {
        this.playMode = playMode;
    }

    public int getManualSwitch() {
        return manualSwitch;
    }

    public void setManualSwitch(int manualSwitch) {
        this.manualSwitch = manualSwitch;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public List<RtMediaMaterial> getMediaMaterialList() {
        return mediaMaterialList;
    }

    public void setMediaMaterialList(List<RtMediaMaterial> mediaMaterialList) {
        this.mediaMaterialList = mediaMaterialList;
    }

    public int getRealWidth() {
        return realWidth;
    }

    public void setRealWidth(int realWidth) {
        this.realWidth = realWidth;
    }

    public int getRealHeight() {
        return realHeight;
    }

    public void setRealHeight(int realHeight) {
        this.realHeight = realHeight;
    }

    public int getRealLeft() {
        return realLeft;
    }

    public void setRealLeft(int realLeft) {
        this.realLeft = realLeft;
    }

    public int getRealTop() {
        return realTop;
    }

    public void setRealTop(int realTop) {
        this.realTop = realTop;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getLimitMode() {
        return limitMode;
    }

    public void setLimitMode(int limitMode) {
        this.limitMode = limitMode;
    }

    public RtExtendTimeInfo getExtendTimeInfo() {
        return extendTimeInfo;
    }

    public void setExtendTimeInfo(RtExtendTimeInfo extendTimeInfo) {
        this.extendTimeInfo = extendTimeInfo;
    }

    public List<RtMediaMaterial> getValidMaterailList() {
        return validMaterailList;
    }

    public void setValidMaterailList(List<RtMediaMaterial> validMaterailList) {
        this.validMaterailList = validMaterailList;
    }

    public List<RtScript> getScriptList() {
        return scriptList;
    }

    public void setScriptList(List<RtScript> scriptList) {
        this.scriptList = scriptList;
    }

    public String getExtends2() {
        return extends2;
    }

    public void setExtends2(String extends2) {
        this.extends2 = extends2;
    }

	/**
	
	 * @return the extends1  
	
	 */
	public String getExtends1() {
		return extends1;
	}

	/**
	
	 * @param extends1 the extends1 to set  
	
	 */
	public void setExtends1(String extends1) {
		this.extends1 = extends1;
	}
}