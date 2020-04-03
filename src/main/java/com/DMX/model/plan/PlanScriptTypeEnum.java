package com.DMX.model.plan;

/**
 * 下发计划中各区域的类型值
 * @author Eric
 */
public enum PlanScriptTypeEnum {
    VIDEO("video",1,"视频"),
    IMAGE("image",2,"图片素材"),
    HTML("html", 3, "html素材"),
    OFFICE("office", 4, "office"),
    AUDIO("audio",5,"音频"),
    SCRIPT("script", 6, ""),
    SUBTITLE("subtitle", 7, "字幕"),
    DATETEMPL("dateTmpl", 8, "日期模板"),
    STREAM("stream", 9, "流文件"),
    PHOTO("photo", 10, "相册"),
    ;


    private String code;
    private Integer type;
    private String name;

    PlanScriptTypeEnum(String code, Integer type, String name) {
        this.code = code;
        this.type = type;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
