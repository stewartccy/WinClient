package com.DMX.model.sys.version;

import com.DMX.model.BaseEntity;

/**
 * 客户端版本信息
 * @author eric
 */
public class ClientVersion extends BaseEntity {

    private Integer versionCode;
    private String filePath;

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
