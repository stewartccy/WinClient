package com.DMX.entity.plan;

public class RtMediaMaterial extends RtBase {
    private String classType;
    private String filePath;
    private int width;
    private int height;
    private String extends1;
    private int playTimes;
    private long duration;
    private int volume;
    private String md5;
    private int limitMode;
    private RtExtendTimeInfo extendTimeInfo;
    private String convertPath;
    private String convertImagePath;
    private int imageNums;
    
    //MD5值
    private String extends10; 

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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

    public String getExtends1() {
        return extends1;
    }

    public void setExtends1(String extends1) {
        this.extends1 = extends1;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setPlayTimes(int playTimes) {
        this.playTimes = playTimes;
    }

    public int getPlayTimes() {
        return playTimes;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
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

    public String getConvertPath() {
        return convertPath;
    }

    public void setConvertPath(String convertPath) {
        this.convertPath = convertPath;
    }

    public String getConvertImagePath() {
        return convertImagePath;
    }

    public void setConvertImagePath(String convertImagePath) {
        this.convertImagePath = convertImagePath;
    }

    public int getImageNums() {
        return imageNums;
    }

    public void setImageNums(int imageNums) {
        this.imageNums = imageNums;
    }

	/**
	
	 * @return the extends10  
	
	 */
	public String getExtends10() {
		return extends10;
	}

	/**
	
	 * @param extends10 the extends10 to set  
	
	 */
	public void setExtends10(String extends10) {
		this.extends10 = extends10;
	}
}
