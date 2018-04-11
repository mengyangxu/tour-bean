package com.xmy.bean.bean;

import java.util.Date;

/**
 * @Description:
 * @Author: xumengyang
 * @Date: Created in 15:45 2018/4/11
 */
public class Chatlog {
    private Integer fromId;
    private Integer toId;
    private String content;
    private Date sendTime;
    private Integer state;  //0未读，1已读

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
