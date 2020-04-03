package com.DMX.entity;
/*
 *    Copyright 2018, Hanfan Data
 *
 *    author: zhouyong
 *    date: 2018/11/22
 */


import com.DMX.entity.plan.RtTemplateDetail;

import java.util.Date;
import java.util.List;

public class Scenario implements Comparable<Scenario>{
    private String id;
    private String name;
    private long duration;
    private Date startTime;
    private Date endTime;
    private String effectTime;
    private String expireTime;
    private List<RtTemplateDetail> positionList;
    private boolean isPlaying = false;
    private boolean isOutOfDate = false;
    private boolean needPlay = false;
    private int prior;
    private int playTimes;
    private int width;
    private int height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<RtTemplateDetail> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<RtTemplateDetail> positionList) {
        this.positionList = positionList;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public boolean isOutOfDate() {
        return isOutOfDate;
    }

    public void setOutOfDate(boolean outOfDate) {
        isOutOfDate = outOfDate;
    }

    public boolean isNeedPlay() {
        return needPlay;
    }

    public void setNeedPlay(boolean needPlay) {
        this.needPlay = needPlay;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        this.prior = prior;
    }

    public int getPlayTimes() {
        return playTimes;
    }

    public void setPlayTimes(int playTimes) {
        this.playTimes = playTimes;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object scenario) {
        if(scenario instanceof  Scenario) {
            return this.prior > ((Scenario) scenario).getPrior();
        } else {
            return  false;
        }
    }

    @Override
    public int compareTo(Scenario scenario) {
        return scenario.getPrior() - this.prior;
    }
}
