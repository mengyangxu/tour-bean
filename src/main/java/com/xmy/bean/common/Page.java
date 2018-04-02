package com.xmy.bean.common;

/**
 * @Description:
 * @Author: xumengyang
 * @Date: Created in 14:36 2018/4/2
 */
public class Page {
    private int pageSize;   //每页个数

    private int currentResult;  //当前多少个
    private int currentPage;    //当前页

    private int totalPage;  //总页数
    private int totalResult;    //总共个数

    public Page(){

    }

    public Page(int pageSize, int totalResult, int currentPage){
        this.pageSize = pageSize;
        this.totalResult = totalResult;

        this.totalPage = totalResult/pageSize;
        if(totalResult%pageSize==0){
            this.totalPage = totalResult/pageSize;
        } else {
            this.totalPage = totalResult/pageSize+1;
        }

        this.currentResult = (currentPage-1) * pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentResult() {
        return currentResult;
    }

    public void setCurrentResult(int currentResult) {
        this.currentResult = currentResult;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }
}
