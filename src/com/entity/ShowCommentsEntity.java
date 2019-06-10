package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Comments", schema = "liff", catalog = "")
public class ShowCommentsEntity {
    private long cid;
    private long cfid;
    private long cuid;
    private String cname;
    private String cimg;
    private String ctext;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    private Timestamp ctime;

    public ShowCommentsEntity(long cid, long cfid, long cuid,String cname,String cimg, String ctext, Timestamp ctime) {
        this.cid = cid;
        this.cfid = cfid;
        this.cuid = cuid;
        this.cname = cname;
        this.cimg = cimg;
        this.ctext = ctext;
        this.ctime = ctime;
    }

    @Id
    @Column(name = "Cid")
    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "Cfid")
    public long getCfid() {
        return cfid;
    }

    public void setCfid(long cfid) {
        this.cfid = cfid;
    }

    @Basic
    @Column(name = "Cuid")
    public long getCuid() {
        return cuid;
    }

    public void setCuid(long cuid) {
        this.cuid = cuid;
    }

    @Basic
    @Column(name = "Ctext")
    public String getCtext() {
        return ctext;
    }

    public void setCtext(String ctext) {
        this.ctext = ctext;
    }

    @Basic
    @Column(name = "Ctime")
    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowCommentsEntity that = (ShowCommentsEntity) o;
        return cid == that.cid &&
                cfid == that.cfid &&
                cuid == that.cuid &&
                Objects.equals(ctext, that.ctext) &&
                Objects.equals(ctime, that.ctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cfid, cuid, ctext, ctime);
    }
}
