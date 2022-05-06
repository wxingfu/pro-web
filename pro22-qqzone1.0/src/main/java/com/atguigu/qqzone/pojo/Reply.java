package com.atguigu.qqzone.pojo;

import java.io.Serializable;
import java.util.Date;

public class Reply implements Serializable {

    private Integer id;
    private String content;
    private Date replyDate;
    private UserBasic author;  //M:1
    private Topic topic;       //M:1

    private HostReply hostReply;   //1:1

    public Reply() {
    }

    public Reply(Integer id) {
        this.id = id;
    }

    public Reply(Integer id, String content, Date replyDate, UserBasic author, Topic topic, HostReply hostReply) {
        this.id = id;
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
        this.hostReply = hostReply;
    }

    public Reply(String content, Date replyDate, UserBasic author, Topic topic) {
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public HostReply getHostReply() {
        return hostReply;
    }

    public void setHostReply(HostReply hostReply) {
        this.hostReply = hostReply;
    }
}
