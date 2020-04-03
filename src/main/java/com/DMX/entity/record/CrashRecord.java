package com.DMX.entity.record;

public class CrashRecord {
    //一条记录代表播放了一次
	String crashRecordId;
	
	String crashInfo;
	
    String crashMsg;

    public CrashRecord(String crashRecordId, String crashMsg) {
        this.crashRecordId = crashRecordId;
        this.crashMsg = crashMsg;
    }

    public CrashRecord() {
    }

    public String getCrashRecordId() {
        return this.crashRecordId;
    }

    public void setCrashRecordId(String string) {
        this.crashRecordId = string;
    }

    public String getCrashMsg() {
        return this.crashMsg;
    }

    public void setCrashMsg(String crashMsg) {
        this.crashMsg = crashMsg;
    }
    
    public String getCrashInfo() {
        return this.crashInfo;
    }

    public void setCrashInfo(String crashInfo) {
        this.crashInfo = crashInfo;
    }
}
