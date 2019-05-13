package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "thumbs_up", schema = "liff", catalog = "")
public class ThumbsUpEntity {
    private long tid;
    private Timestamp tdate;

    @Id
    @Column(name = "Tid")
    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
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
                Objects.equals(tdate, that.tdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, tdate);
    }
}
