package com.DMX.model.record;

public class FullConnectInfo {
    long disconnectTime;
    long reconnectSuccessTime;

    public long getDisconnectTime() {
        return disconnectTime;
    }

    public void setDisconnectTime(long disconnectTime) {
        this.disconnectTime = disconnectTime;
    }

    public long getReconnectSuccessTime() {
        return reconnectSuccessTime;
    }

    public void setReconnectSuccessTime(long reconnectSuccessTime) {
        this.reconnectSuccessTime = reconnectSuccessTime;
    }
}
