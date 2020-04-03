package com.DMX.entity.plan;

public class PlanEvent {
    public static final int PLAN_TYPE_SCENARIO = 0;
    public static final int PLAN_TYPE_ROLL_MESSAGE = 1;

    private boolean isIdle;
    private int type;
    private String id;

    public PlanEvent() {
    }

    public PlanEvent(boolean isIdle,int type,String id) {
        this.isIdle = isIdle;
        this.type = type;
        this.id = id;
    }

    public boolean isIdle() {
        return isIdle;
    }

    public void setIdle(boolean idle) {
        isIdle = idle;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}