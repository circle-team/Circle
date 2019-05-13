package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "board", schema = "liff", catalog = "")
public class BoardEntity {
    private long bDid;
    private String bDtext;
    private Timestamp bDtime;

    @Id
    @Column(name = "BDid")
    public long getbDid() {
        return bDid;
    }

    public void setbDid(long bDid) {
        this.bDid = bDid;
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
                Objects.equals(bDtext, that.bDtext) &&
                Objects.equals(bDtime, that.bDtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bDid, bDtext, bDtime);
    }
}
