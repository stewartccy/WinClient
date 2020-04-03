package com.DMX.model.plan;

public class PlanTime {
    private RtPlan plan;
    private long duration;

    public RtPlan getPlan() {
        return plan;
    }

    public void setPlan(RtPlan plan) {
        this.plan = plan;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
