package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Thumbs_up", schema = "liff", catalog = "")
public class ThumbsUpEntity {
    private long tid;
    private long thbid;
    private long tuid;
    private Timestamp tdate;

    public ThumbsUpEntity(long tid, long thbid, long tuid, Timestamp tdate) {
        this.tid = tid;
        this.thbid = thbid;
        this.tuid = tuid;
        this.tdate = tdate;
    }

    @Id
    @Column(name = "Tid")
    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "Thbid")
    public long getThbid() {
        return thbid;
    }

    public void setThbid(long thbid) {
        this.thbid = thbid;
    }

    @Basic
    @Column(name = "Tuid")
    public long getTuid() {
        return tuid;
    }

    public void setTuid(long tuid) {
        this.tuid = tuid;
    }

    @Basic
    @Column(name = "Tdate")
    public Timestamp getTdate() {
        return tdate;
    }

    public void setTdate(Timestamp tdate) {
        this.tdate = tdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThumbsUpEntity that = (ThumbsUpEntity) o;
        return tid == that.tid &&
                thbid == that.thbid &&
                tuid == that.tuid &&
                Objects.equals(tdate, that.tdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, thbid, tuid, tdate);
    }
}
