package com.DMX.model.record;

import java.util.List;

public class PerPlayRecord {
    //一条记录代表播放了一次
    Long playRecordId;

    String perMediaMaterialId;
    String perMediaMaterialName;
    int playCounts;
    List<MinRecordDetail> detailList;


    public PerPlayRecord(Long playRecordId, String perMediaMaterialId, String perMediaMaterialName,
            int playCounts, List<MinRecordDetail> detailList) {
        this.playRecordId = playRecordId;
        this.perMediaMaterialId = perMediaMaterialId;
        this.perMediaMaterialName = perMediaMaterialName;
        this.playCounts = playCounts;
        this.detailList = detailList;
    }


    public PerPlayRecord() {
    }


    public Long getPlayRecordId() {
        return this.playRecordId;
    }


    public void setPlayRecordId(Long playRecordId) {
        this.playRecordId = playRecordId;
    }


    public String getPerMediaMaterialId() {
        return this.perMediaMaterialId;
    }


    public void setPerMediaMaterialId(String perMediaMaterialId) {
        this.perMediaMaterialId = perMediaMaterialId;
    }


    public String getPerMediaMaterialName() {
        return this.perMediaMaterialName;
    }


    public void setPerMediaMaterialName(String perMediaMaterialName) {
        this.perMediaMaterialName = perMediaMaterialName;
    }


    public int getPlayCounts() {
        return this.playCounts;
    }


    public void setPlayCounts(int playCounts) {
        this.playCounts = playCounts;
    }


    public List<MinRecordDetail> getDetailList() {
        return this.detailList;
    }


    public void setDetailList(List<MinRecordDetail> detailList) {
        this.detailList = detailList;
    }




}
