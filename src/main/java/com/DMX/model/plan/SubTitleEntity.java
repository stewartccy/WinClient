package com.DMX.model.plan;


/**
 * 字幕对象
 * @author Eric
 * @date 2019年6月18日17:55:36
 */
public class SubTitleEntity {

    //                {"subtitleBgColor":"-9787313","subtitleFontColor":"-3407872","subtitleScrollingSpeed":"normal","subtitleDirection":"r2l",
//                "subtitleContent":"自摸自摸字幕内容字幕内容字幕内容字幕内容字幕内容"}


    /**
     * 字幕背景颜色
     */
    private String subtitleBgColor;
    /**
     * 字幕字体颜色
     */
    private String subtitleFontColor;
    /**
     * 字幕滚动速度
     */
    private String subtitleScrollingSpeed;
    /**
     *字幕方向
     */
    private String subtitleDirection;
    /**
     * 字幕内容
     */
    private String subtitleContent;

    public String getSubtitleBgColor() {
        return subtitleBgColor;
    }

    public void setSubtitleBgColor(String subtitleBgColor) {
        this.subtitleBgColor = subtitleBgColor;
    }

    public String getSubtitleFontColor() {
        return subtitleFontColor;
    }

    public void setSubtitleFontColor(String subtitleFontColor) {
        this.subtitleFontColor = subtitleFontColor;
    }

    public String getSubtitleScrollingSpeed() {
        return subtitleScrollingSpeed;
    }

    public void setSubtitleScrollingSpeed(String subtitleScrollingSpeed) {
        this.subtitleScrollingSpeed = subtitleScrollingSpeed;
    }

    public String getSubtitleDirection() {
        return subtitleDirection;
    }

    public void setSubtitleDirection(String subtitleDirection) {
        this.subtitleDirection = subtitleDirection;
    }

    public String getSubtitleContent() {
        return subtitleContent;
    }

    public void setSubtitleContent(String subtitleContent) {
        this.subtitleContent = subtitleContent;
    }
}
