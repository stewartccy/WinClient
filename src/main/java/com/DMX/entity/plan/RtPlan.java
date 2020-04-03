package com.DMX.entity.plan;

import java.util.List;

public class RtPlan extends RtBase {
    private int prior;
    private int sendStatus;
    private List<RtScript> scriptList;

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        this.prior = prior;
    }

    public int getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(int sendStatus) {
        this.sendStatus = sendStatus;
    }

    public List<RtScript> getScriptList() {
        return scriptList;
    }

    public void setScriptList(List<RtScript> scriptList) {
        this.scriptList = scriptList;
    }
}