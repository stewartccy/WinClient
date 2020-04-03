package com.DMX.entity.plan;

public class TimeTemplateEntity {

    /**
     * 年月日格式
     */
    private String dateTmplymForm;
    /**
     * 时分秒格式
     */
    private String dateTmplTimeForm;
    /**
     * 星期格式
     */
    private String dateTmplWeekForm;
    /**
     * 颜色  #6aa84f
     */
    private String dateTmplColorForm;

    public String getDateTmplymForm() {
        return dateTmplymForm;
    }

    public void setDateTmplymForm(String dateTmplymForm) {
        this.dateTmplymForm = dateTmplymForm;
    }

    public String getDateTmplTimeForm() {
        return dateTmplTimeForm;
    }

    public void setDateTmplTimeForm(String dateTmplTimeForm) {
        this.dateTmplTimeForm = dateTmplTimeForm;
    }

    public String getDateTmplWeekForm() {
        return dateTmplWeekForm;
    }

    public void setDateTmplWeekForm(String dateTmplWeekForm) {
        this.dateTmplWeekForm = dateTmplWeekForm;
    }

    public String getDateTmplColorForm() {
        return dateTmplColorForm;
    }

    public void setDateTmplColorForm(String dateTmplColorForm) {
        this.dateTmplColorForm = dateTmplColorForm;
    }
}
