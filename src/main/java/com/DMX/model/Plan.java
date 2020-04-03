package com.DMX.model;

public class Plan {
    private String planTime;
    private String script;

    public Plan(String planTime,String script) {
        this.planTime = planTime;
        this.script = script;
    }

    public String getPlanTime() {
        return planTime;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }
}
