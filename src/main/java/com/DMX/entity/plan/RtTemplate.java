package com.DMX.entity.plan;

import java.util.List;

public class RtTemplate extends RtBase {
    private String type;
    private int width;
    private int height;
    private int levelSum;
    private String extends3;
    private String extends4;
    private List<RtTemplateDetail> templateDetailList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getLevelSum() {
        return levelSum;
    }

    public void setLevelSum(int levelSum) {
        this.levelSum = levelSum;
    }

    public List<RtTemplateDetail> getTemplateDetailList() {
        return templateDetailList;
    }

    public String getExtends3() {
        return extends3;
    }

    public void setExtends3(String extends3) {
        this.extends3 = extends3;
    }

    public String getExtends4() {
        return extends4;
    }

    public void setExtends4(String extends4) {
        this.extends4 = extends4;
    }

    public void setTemplateDetailList(List<RtTemplateDetail> templateDetailList) {
        this.templateDetailList = templateDetailList;
    }
}