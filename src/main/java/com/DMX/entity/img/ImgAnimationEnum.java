package com.DMX.entity.img;

public enum ImgAnimationEnum {
    BAIYE("blindsLeft",0,"百叶窗"),
    CACHU("fadeBottom",1,"擦除"),
    HEZHUANG("oneSquare", 2, "盒装"),
    LINGXING("curtainLeft", 4, "菱形"),
    LUNZI("curtainRight",5,"轮子"),
    PILIE("blindsCenter", 6, "劈裂"),
    QIPAN("bomb", 7, "棋盘"),
    QIERU("fadeRight", 8, "切入"),
    SHANXING("mosaic", 9, "扇形"),
    SHIZIKUOZHAN("interlaceRight", 10, "十字扩展"),
    SUIJIXIANTAO("blindsBottom", 11, "随机线条"),
    RONGJIE("mosaic", 12, "溶解"),
    YUANXINGKUOZHAN("oneCircle", 13, "圆形扩展"),
    ;

    ImgAnimationEnum(String code,int type,String desc) {
        this.code = code;
        this.type = type;
        this.desc = desc;
    }

    private String code;
    private int type;
    private String desc;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
