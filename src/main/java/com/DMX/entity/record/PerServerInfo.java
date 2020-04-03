package com.DMX.entity.record;

public class PerServerInfo {
    //web服务器地址
    String webServer;
    int webPort;
    //netty服务器地址，server和port在一起用：连接
    String nettyServer;
    //slaveFtp
    String sSlaveFtpServer;
    String sSlaveFtpPort;
    //masterFtp
    String sMasterFtpServer;
    String sMasterFtpPort;

    public PerServerInfo(){}
    public PerServerInfo(String webServer, int webPort, String nettyServer, String sSlaveFtpServer, String sSlaveFtpPort, String sMasterFtpServer, String sMasterFtpPort) {
        this.webServer = webServer;
        this.webPort = webPort;
        this.nettyServer = nettyServer;
        this.sSlaveFtpServer = sSlaveFtpServer;
        this.sSlaveFtpPort = sSlaveFtpPort;
        this.sMasterFtpServer = sMasterFtpServer;
        this.sMasterFtpPort = sMasterFtpPort;
    }

    public String getWebServer() {
        return webServer;
    }

    public void setWebServer(String webServer) {
        this.webServer = webServer;
    }

    public int getWebPort() {
        return webPort;
    }

    public void setWebPort(int webPort) {
        this.webPort = webPort;
    }

    public String getNettyServer() {
        return nettyServer;
    }

    public void setNettyServer(String nettyServer) {
        this.nettyServer = nettyServer;
    }

    public String getsSlaveFtpServer() {
        return sSlaveFtpServer;
    }

    public void setsSlaveFtpServer(String sSlaveFtpServer) {
        this.sSlaveFtpServer = sSlaveFtpServer;
    }

    public String getsSlaveFtpPort() {
        return sSlaveFtpPort;
    }

    public void setsSlaveFtpPort(String sSlaveFtpPort) {
        this.sSlaveFtpPort = sSlaveFtpPort;
    }

    public String getsMasterFtpServer() {
        return sMasterFtpServer;
    }

    public void setsMasterFtpServer(String sMasterFtpServer) {
        this.sMasterFtpServer = sMasterFtpServer;
    }

    public String getsMasterFtpPort() {
        return sMasterFtpPort;
    }

    public void setsMasterFtpPort(String sMasterFtpPort) {
        this.sMasterFtpPort = sMasterFtpPort;
    }
}
