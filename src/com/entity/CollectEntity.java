package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Collect", schema = "liff", catalog = "")
public class CollectEntity {
    private long cbid;
    private long cuid;
    private Timestamp ctime;

    public CollectEntity( long cbid, long cuid, Timestamp ctime) {

        this.cbid = cbid;
        this.cuid = cuid;
        this.ctime = ctime;
    }



    @Basic
    @Column(name = "Cbid")
    public long getCbid() {
        return cbid;
    }

    public void setCbid(long cbid) {
        this.cbid = cbid;
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
        CollectEntity that = (CollectEntity) o;
        return
                cbid == that.cbid &&
                cuid == that.cuid &&
                Objects.equals(ctime, that.ctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash( cbid, cuid, ctime);
    }
}
