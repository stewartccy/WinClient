package com.DMX.model.plan;

public class DownloadProcess {
    private int current;
    private int total;
    private int process;

    public DownloadProcess(int current,int total,int process) {
        this.current = current;
        this.total = total;
        this.process = process;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }
}
