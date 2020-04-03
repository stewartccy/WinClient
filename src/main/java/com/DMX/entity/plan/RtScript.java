package com.DMX.entity.plan;

import com.DMX.entity.BaseEntity;

public class RtScript extends BaseEntity {
    private String templateId;
    private int playTimes;
    private int duration;
    private RtTemplate template;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public int getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(int playTimes) {
        this.playTimes = playTimes;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public RtTemplate getTemplate() {
        return template;
    }

    public void setTemplate(RtTemplate template) {
        this.template = template;
    }
}