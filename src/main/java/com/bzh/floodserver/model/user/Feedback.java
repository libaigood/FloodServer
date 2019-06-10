package com.bzh.floodserver.model.user;


import java.util.Date;

public class Feedback {
    //id
    private Integer id;
    //contents
    private String contents;
    //time
    private Date time;
    //uid
    private String uName;

    public Feedback() {
    }

    public Feedback(Integer id, String contents, Date time, String uName) {
        this.id = id;
        this.contents = contents;
        this.time = time;
        this.uName = uName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}
