package com.DMX.entity.sys;

/**
 * 设备信息,保存发送到netty的json格式
 * @author Eric
 * @date 2019年7月1日17:48:57
 *
 */
public class ClientInfo {

    /**
     * 设备名称
     */
    private String name;
    /**
     * 屏幕分辨率 1920*1080
     */
    private String resolution;
    /**
     *  所属机构ID
     */
    private String organId;
    /**
     * 总存储容量
     */
    private Long  totalStorage;
    /**
     * 剩余存储容量
     */
    private Long  availableStorage;
    /**
     * 是否是横屏
     */
    private Boolean isLandScape;
    /**
     * 是否是拼接屏
     */
    private Boolean isSplicingScreen;
    /**
     * 是否是触屏
     */
    private Boolean isTouchScreen;
    /**
     * 厂商型号 xxx-xxx
     */
    private String factoryAndVersion;
    /**
     * 所属终端组ID
     */
    private String groupId;

    /**
     * 终端版本号
     */
    private String appVersion;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public Long getTotalStorage() {
        return totalStorage;
    }

    public void setTotalStorage(Long totalStorage) {
        this.totalStorage = totalStorage;
    }

    public Long getAvailableStorage() {
        return availableStorage;
    }

    public void setAvailableStorage(Long availableStorage) {
        this.availableStorage = availableStorage;
    }

    public Boolean getLandScape() {
        return isLandScape;
    }

    public void setLandScape(Boolean landScape) {
        isLandScape = landScape;
    }

    public Boolean getSplicingScreen() {
        return isSplicingScreen;
    }

    public void setSplicingScreen(Boolean splicingScreen) {
        isSplicingScreen = splicingScreen;
    }

    public Boolean getTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(Boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public String getFactoryAndVersion() {
        return factoryAndVersion;
    }

    public void setFactoryAndVersion(String factoryAndVersion) {
        this.factoryAndVersion = factoryAndVersion;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
