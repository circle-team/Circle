package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Message", schema = "liff", catalog = "")
public class MessageEntity {
    private long mid;
    private long mruid;
    private long msuid;
    private String mtext;
    private Timestamp mtime;

    @Id
    @Column(name = "Mid")
    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "Mruid")
    public long getMruid() {
        return mruid;
    }

    public void setMruid(long mruid) {
        this.mruid = mruid;
    }

    @Basic
    @Column(name = "Msuid")
    public long getMsuid() {
        return msuid;
    }

    public void setMsuid(long msuid) {
        this.msuid = msuid;
    }

    @Basic
    @Column(name = "Mtext")
    public String getMtext() {
        return mtext;
    }

    public void setMtext(String mtext) {
        this.mtext = mtext;
    }

    @Basic
    @Column(name = "Mtime")
    public Timestamp getMtime() {
        return mtime;
    }

    public void setMtime(Timestamp mtime) {
        this.mtime = mtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEntity that = (MessageEntity) o;
        return mid == that.mid &&
                mruid == that.mruid &&
                msuid == that.msuid &&
                Objects.equals(mtext, that.mtext) &&
                Objects.equals(mtime, that.mtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mid, mruid, msuid, mtext, mtime);
    }
}
