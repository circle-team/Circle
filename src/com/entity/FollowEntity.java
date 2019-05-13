package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "follow", schema = "liff", catalog = "")
public class FollowEntity {
    private long fid;
    private Timestamp ftime;

    @Id
    @Column(name = "Fid")
    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "Ftime")
    public Timestamp getFtime() {
        return ftime;
    }

    public void setFtime(Timestamp ftime) {
        this.ftime = ftime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowEntity that = (FollowEntity) o;
        return fid == that.fid &&
                Objects.equals(ftime, that.ftime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fid, ftime);
    }
}