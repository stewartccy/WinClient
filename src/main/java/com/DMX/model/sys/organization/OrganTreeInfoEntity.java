package com.DMX.model.sys.organization;

import java.util.List;

/**
 * 组织树
 * @author Eric
 * @date 2019年6月29日22:17:15
 */
public class OrganTreeInfoEntity {

    private String id;
    private String name;
    private String text;

    private Organization sysOrgan;

    private List<OrganTreeInfoEntity> children;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Organization getSysOrgan() {
        return sysOrgan;
    }

    public void setSysOrgan(Organization sysOrgan) {
        this.sysOrgan = sysOrgan;
    }

    public List<OrganTreeInfoEntity> getChildren() {
        return children;
    }

    public void setChildren(List<OrganTreeInfoEntity> children) {
        this.children = children;
    }
}
