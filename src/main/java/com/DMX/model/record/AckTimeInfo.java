package com.DMX.model.record;

import java.util.List;

public class AckTimeInfo {
    List<FullConnectInfo> ackTimeList;

    public List<FullConnectInfo> getAckTimeList() {
        return ackTimeList;
    }

    public void setAckTimeList(List<FullConnectInfo> ackTimeList) {
        this.ackTimeList = ackTimeList;
    }
}
