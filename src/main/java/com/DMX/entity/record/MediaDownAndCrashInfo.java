package com.DMX.entity.record;

import java.util.List;

public class MediaDownAndCrashInfo {
    List<PerMediaInfo> perMeidalist;
    List<CrashRecord> crashList;

    public List<PerMediaInfo> getPerMeidalist() {
        return perMeidalist;
    }

    public void setPerMeidalist(List<PerMediaInfo> perMeidalist) {
        this.perMeidalist = perMeidalist;
    }

    public List<CrashRecord> getCrashList() {
        return crashList;
    }

    public void setCrashList(List<CrashRecord> crashList) {
        this.crashList = crashList;
    }
}
