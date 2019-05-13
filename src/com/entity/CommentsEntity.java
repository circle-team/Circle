package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "comments", schema = "liff", catalog = "")
public class CommentsEntity {
    private long cid;
    private String ctext;
    private Timestamp ctime;

    @Id
    @Column(name = "Cid")
    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
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
        CommentsEntity that = (CommentsEntity) o;
        return cid == that.cid &&
                Objects.equals(ctext, that.ctext) &&
                Objects.equals(ctime, that.ctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, ctext, ctime);
    }
}
