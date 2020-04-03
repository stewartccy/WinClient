package com.DMX.model.record;


public class PerMediaInfo {

    Long playMediaId;

    String serverPath;
    String localPath;
    String md5;
    int total;
    int currentIndex;
    String mediaId;
    String scriptId;
    String planId;
    String server;
    String port;
    boolean downLoadState;
    String nodeComment;
    public PerMediaInfo(Long playMediaId, String serverPath, String localPath,
            String md5, int total, int currentIndex, String mediaId,
            String scriptId, String planId, String server, String port,
            boolean downLoadState, String nodeComment) {
        this.playMediaId = playMediaId;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.md5 = md5;
        this.total = total;
        this.currentIndex = currentIndex;
        this.mediaId = mediaId;
        this.scriptId = scriptId;
        this.planId = planId;
        this.server = server;
        this.port = port;
        this.downLoadState = downLoadState;
        this.nodeComment = nodeComment;
    }
    public PerMediaInfo() {
    }
    public Long getPlayMediaId() {
        return this.playMediaId;
    }
    public void setPlayMediaId(Long playMediaId) {
        this.playMediaId = playMediaId;
    }
    public String getServerPath() {
        return this.serverPath;
    }
    public void setServerPath(String serverPath) {
        this.serverPath = serverPath;
    }
    public String getLocalPath() {
        return this.localPath;
    }
    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }
    public String getMd5() {
        return this.md5;
    }
    public void setMd5(String md5) {
        this.md5 = md5;
    }
    public int getTotal() {
        return this.total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getCurrentIndex() {
        return this.currentIndex;
    }
    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
    public String getMediaId() {
        return this.mediaId;
    }
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }
    public String getScriptId() {
        return this.scriptId;
    }
    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }
    public String getPlanId() {
        return this.planId;
    }
    public void setPlanId(String planId) {
        this.planId = planId;
    }
    public String getServer() {
        return this.server;
    }
    public void setServer(String server) {
        this.server = server;
    }
    public String getPort() {
        return this.port;
    }
    public void setPort(String port) {
        this.port = port;
    }
    public boolean getDownLoadState() {
        return this.downLoadState;
    }
    public void setDownLoadState(boolean downLoadState) {
        this.downLoadState = downLoadState;
    }
    public String getNodeComment() {
        return this.nodeComment;
    }
    public void setNodeComment(String nodeComment) {
        this.nodeComment = nodeComment;
    }

    @Override
    public String toString() {
        return "PerMediaInfo{" +
                "playMediaId=" + playMediaId +
                ", serverPath='" + serverPath + '\'' +
                ", localPath='" + localPath + '\'' +
                ", md5='" + md5 + '\'' +
                ", total=" + total +
                ", currentIndex=" + currentIndex +
                ", mediaId='" + mediaId + '\'' +
                ", scriptId='" + scriptId + '\'' +
                ", planId='" + planId + '\'' +
                ", server='" + server + '\'' +
                ", port='" + port + '\'' +
                ", downLoadState=" + downLoadState +
                ", nodeComment='" + nodeComment + '\'' +
                '}';
    }
}
