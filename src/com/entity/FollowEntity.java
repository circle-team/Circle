package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Follow", schema = "liff", catalog = "")
public class FollowEntity {

    private long fhuid;
    private long fuid;
    private Timestamp ftime;

    public FollowEntity(long fhuid, long fuid, Timestamp ftime) {

        this.fhuid = fhuid;
        this.fuid = fuid;
        this.ftime = ftime;
    }
    public FollowEntity(long fhuid, long fuid){

        this.fhuid = fhuid;
        this.fuid = fuid;
    }
    public FollowEntity(){

    }

    @Basic
    @Column(name = "Fhuid")
    public long getFhuid() {
        return fhuid;
    }

    public void setFhuid(long fhuid) {
        this.fhuid = fhuid;
    }

    @Basic
    @Column(name = "Fuid")
    public long getFuid() {
        return fuid;
    }

    public void setFuid(long fuid) {
        this.fuid = fuid;
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
        return fhuid == that.fhuid &&
                fuid == that.fuid &&
                Objects.equals(ftime, that.ftime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fhuid, fuid, ftime);
    }
}
