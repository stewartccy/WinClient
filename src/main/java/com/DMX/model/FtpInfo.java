package com.DMX.model;
/*
 *    Copyright 2018, Hanfan Data
 *
 *    author: zhouyong
 *    date: 2018/12/11
 */

public class FtpInfo {
    private String server;
    private String port;
    private String user;
    private String password;
    private String dir;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
