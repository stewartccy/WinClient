package com.DMX.entity.record;

import java.util.List;

public class NettReconnectInfo {
    Long _Id;

    List<FullConnectInfo> detailList;


    public NettReconnectInfo(Long _Id, List<FullConnectInfo> detailList) {
        this._Id = _Id;
        this.detailList = detailList;
    }


    public NettReconnectInfo() {
    }


    public Long get_Id() {
        return this._Id;
    }


    public void set_Id(Long _Id) {
        this._Id = _Id;
    }


    public List<FullConnectInfo> getDetailList() {
        return this.detailList;
    }


    public void setDetailList(List<FullConnectInfo> detailList) {
        this.detailList = detailList;
    }


}
