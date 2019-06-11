package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Follow", schema = "liff", catalog = "")
public class FollowEntity {

    private long fhuid;
    private long fuid;


    public FollowEntity(long fhuid, long fuid) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowEntity that = (FollowEntity) o;
        return fhuid == that.fhuid &&
                fuid == that.fuid ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fhuid, fuid);
    }
}
