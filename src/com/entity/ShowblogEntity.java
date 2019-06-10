package com.entity;

import java.sql.Timestamp;

public class ShowblogEntity {
    private Long blogid;
    private Long uid;
    private String uname;
    private String image;
    private String text;
    private Timestamp date;

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    public Long getIfthumb() {
        return ifthumb;
    }

    public void setIfthumb(Long ifthumb) {
        this.ifthumb = ifthumb;
    }

    private String title;
    private Long thumbnumber;
    private Long commentnumber;
    private String uimage;
    private Long ifthumb;

    public ShowblogEntity(Long blogid,Long uid,String uname,String image,String text,Timestamp date,String title,Long thumbnumber,Long commentnumber,String uimage,Long ifthumb)
    {
        this.blogid=blogid;
        this.uid=uid;
        this.uname=uname;
        this.image=image;
        this.text=text;
        this.date=date;
        this.title=title;
        this.thumbnumber=thumbnumber;
        this.commentnumber=commentnumber;
        this.uimage=uimage;
        this.ifthumb=ifthumb;
    }

    public Long getBlogid() {
        return blogid;
    }

    public void setBlogid(Long blogid) {
        this.blogid = blogid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getThumbnumber() {
        return thumbnumber;
    }

    public void setThumbnumber(Long thumbnumber) {
        this.thumbnumber = thumbnumber;
    }

    public Long getCommentnumber() {
        return commentnumber;
    }

    public void setCommentnumber(Long commentnumber) {
        this.commentnumber = commentnumber;
    }
}
