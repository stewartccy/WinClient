package com.DMX.model.record;

public class ServerAndAckTimeInfo {

    PerServerInfo serverInfo;
    AckTimeInfo ackTimeInfo;

    public PerServerInfo getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(PerServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public AckTimeInfo getAckTimeInfo() {
        return ackTimeInfo;
    }

    public void setAckTimeInfo(AckTimeInfo ackTimeInfo) {
        this.ackTimeInfo = ackTimeInfo;
    }
}
