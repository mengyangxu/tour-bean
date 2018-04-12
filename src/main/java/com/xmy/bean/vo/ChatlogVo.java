package com.xmy.bean.vo;

/**
 * @Description:
 * @Author: xumengyang
 * @Date: Created in 11:32 2018/4/12
 */
public class ChatlogVo {
    private String tonick;
    private Integer fromId;
    private String fromnick;
    private String frompic;
    private String content;
    private String sendTime;
    private Integer state;

    public String getFrompic() {
        return frompic;
    }

    public void setFrompic(String frompic) {
        this.frompic = frompic;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public String getTonick() {
        return tonick;
    }

    public void setTonick(String tonick) {
        this.tonick = tonick;
    }

    public String getFromnick() {
        return fromnick;
    }

    public void setFromnick(String fromnick) {
        this.fromnick = fromnick;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
