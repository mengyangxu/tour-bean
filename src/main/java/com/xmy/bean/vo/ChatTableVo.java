package com.xmy.bean.vo;

/**
 * @Description:
 * @Author: xumengyang
 * @Date: Created in 9:57 2018/4/12
 */
public class ChatTableVo {
    private Integer fromId;
    private String fromNickName;
    private Integer state;

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public String getFromNickName() {
        return fromNickName;
    }

    public void setFromNickName(String fromNickName) {
        this.fromNickName = fromNickName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
