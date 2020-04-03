package com.DMX.model.sys;

public class ClientConfigEntity {

    /**
     * 一级机构
     */
    private String organSelect1;
    /**
     * 二级机构
     */
    private String organSelect2;
    /**
     * 三级机构
     */
    private String organSelect3;

    /**
     * 终端组
     */
    private String groupSelect;

    /**
     * 横屏或者竖屏
     */
    private String screenInfoSelect;
    /**
     * 是否是拼接屏
     */
    private Boolean splitScreenSelect;
    /**
     * 是否是触屏
     */
    private Boolean touchScreenSelect;


    public String getOrganSelect1() {
        return organSelect1;
    }

    public void setOrganSelect1(String organSelect1) {
        this.organSelect1 = organSelect1;
    }

    public String getOrganSelect2() {
        return organSelect2;
    }

    public void setOrganSelect2(String organSelect2) {
        this.organSelect2 = organSelect2;
    }

    public String getOrganSelect3() {
        return organSelect3;
    }

    public void setOrganSelect3(String organSelect3) {
        this.organSelect3 = organSelect3;
    }

    public String getGroupSelect() {
        return groupSelect;
    }

    public void setGroupSelect(String groupSelect) {
        this.groupSelect = groupSelect;
    }

    public String getScreenInfoSelect() {
        return screenInfoSelect;
    }

    public void setScreenInfoSelect(String screenInfoSelect) {
        this.screenInfoSelect = screenInfoSelect;
    }

    public Boolean getSplitScreenSelect() {
        return splitScreenSelect;
    }

    public void setSplitScreenSelect(Boolean splitScreenSelect) {
        this.splitScreenSelect = splitScreenSelect;
    }

    public Boolean getTouchScreenSelect() {
        return touchScreenSelect;
    }

    public void setTouchScreenSelect(Boolean touchScreenSelect) {
        this.touchScreenSelect = touchScreenSelect;
    }


    /**
     * 版本号
     */
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
