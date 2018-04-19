package com.xmy.bean.vo;

/**
 * @Description:
 * @Author: xumengyang
 * @Date: Created in 14:15 2018/4/19
 */
public class ArticleSearch {
    private Integer currentResult;
    private Integer pageSize;
    private String nowdays; // week最近一周，month最近一月
    private Integer plate;
    private Integer approve;  //是否已查看(管理员)

    public Integer getCurrentResult() {
        return currentResult;
    }

    public void setCurrentResult(Integer currentResult) {
        this.currentResult = currentResult;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getNowdays() {
        return nowdays;
    }

    public void setNowdays(String nowdays) {
        this.nowdays = nowdays;
    }

    public Integer getPlate() {
        return plate;
    }

    public void setPlate(Integer plate) {
        this.plate = plate;
    }

    public Integer getApprove() {
        return approve;
    }

    public void setApprove(Integer approve) {
        this.approve = approve;
    }
}
