package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Board", schema = "liff", catalog = "")
public class BoardEntity {
    private long bDid;
    private long bDruid;
    private long bDsuid;
    private String bDtext;
    private Timestamp bDtime;

    public BoardEntity(long bDid, long bDruid, long bDsuid, String bDtext, Timestamp bDtime) {
        this.bDid = bDid;
        this.bDruid = bDruid;
        this.bDsuid = bDsuid;
        this.bDtext = bDtext;
        this.bDtime = bDtime;
    }

    @Id
    @Column(name = "BDid")
    public long getbDid() {
        return bDid;
    }

    public void setbDid(long bDid) {
        this.bDid = bDid;
    }

    @Basic
    @Column(name = "BDruid")
    public long getbDruid() {
        return bDruid;
    }

    public void setbDruid(long bDruid) {
        this.bDruid = bDruid;
    }

    @Basic
    @Column(name = "BDsuid")
    public long getbDsuid() {
        return bDsuid;
    }

    public void setbDsuid(long bDsuid) {
        this.bDsuid = bDsuid;
    }

    @Basic
    @Column(name = "BDtext")
    public String getbDtext() {
        return bDtext;
    }

    public void setbDtext(String bDtext) {
        this.bDtext = bDtext;
    }

    @Basic
    @Column(name = "BDtime")
    public Timestamp getbDtime() {
        return bDtime;
    }

    public void setbDtime(Timestamp bDtime) {
        this.bDtime = bDtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardEntity that = (BoardEntity) o;
        return bDid == that.bDid &&
                bDruid == that.bDruid &&
                bDsuid == that.bDsuid &&
                Objects.equals(bDtext, that.bDtext) &&
                Objects.equals(bDtime, that.bDtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bDid, bDruid, bDsuid, bDtext, bDtime);
    }
}
