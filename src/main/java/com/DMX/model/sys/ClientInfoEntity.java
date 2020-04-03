package com.DMX.model.sys;


import com.DMX.model.sys.group.GroupInfo;
import com.DMX.model.sys.organization.Organization;

/**
 * 打开设置界面时从远程查询回来的设备信息
 *
 * @author Eric
 * @date 2019年7月1日17:50:31
 */
public class ClientInfoEntity {

    private String id;
    /**
     * 设备名称
     */
    private String name;
    /**
     * 厂商型号
     */
    private String manufacturer;

    /**
     * 组织id
     */
    private String organId;
    /**
     * 组织名称
     */
    private String organName;
    /**
     * 组织信息
     */
    private Organization sysOrgan;

    /**
     * 终端组id
     */
    private String groupId;
    /**
     * 终端组信息
     */
    private GroupInfo clientGroup;

    /**
     * 屏幕分辨率
     */
    private String dpi;

    /**
     * 横屏 竖屏
     */
    private String extends4;
    /**
     * 拼截屏 非拼截屏
     */
    private String extends5;
    /**
     * 触摸屏 非触摸屏
     */
    private String touchScreen;

    /**
     * 资源释放天数,清除终端的过期素材的天数
     */
    private int extends1;

    public int getExtends1() {
        return extends1;
    }

    public void setExtends1(int extends1) {
        this.extends1 = extends1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOrganId() {
        return organId;
    }

    public void setOrganId(String organId) {
        this.organId = organId;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public Organization getSysOrgan() {
        return sysOrgan;
    }

    public void setSysOrgan(Organization sysOrgan) {
        this.sysOrgan = sysOrgan;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public GroupInfo getClientGroup() {
        return clientGroup;
    }

    public void setClientGroup(GroupInfo clientGroup) {
        this.clientGroup = clientGroup;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getExtends4() {
        return extends4;
    }

    public void setExtends4(String extends4) {
        this.extends4 = extends4;
    }

    public String getExtends5() {
        return extends5;
    }

    public void setExtends5(String extends5) {
        this.extends5 = extends5;
    }

    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
    }
}
