package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "BlogInfo", schema = "liff", catalog = "")
public class BlogInfoEntity {
    private long bid;
    private long buid;
    private String btext;
    private Timestamp bdate;
    private String bimage;
    private String btitle;

    public BlogInfoEntity(long bid, long buid, String btext, Timestamp bdate, String bimage, String btitle) {
        this.bid = bid;
        this.buid = buid;
        this.btext = btext;
        this.bdate = bdate;
        this.bimage = bimage;
        this.btitle = btitle;
    }

    public BlogInfoEntity() {

    }

    @Id
    @Column(name = "Bid")
    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "Buid")
    public long getBuid() {
        return buid;
    }

    public void setBuid(long buid) {
        this.buid = buid;
    }

    @Basic
    @Column(name = "Btext")
    public String getBtext() {
        return btext;
    }

    public void setBtext(String btext) {
        this.btext = btext;
    }

    @Basic
    @Column(name = "Bdate")
    public Timestamp getBdate() {
        return bdate;
    }

    public void setBdate(Timestamp bdate) {
        this.bdate = bdate;
    }

    @Basic
    @Column(name = "Bimage")
    public String getBimage() {
        return bimage;
    }

    public void setBimage(String bimage) {
        this.bimage = bimage;
    }

    @Basic
    @Column(name = "Btitle")
    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogInfoEntity that = (BlogInfoEntity) o;
        return bid == that.bid &&
                buid == that.buid &&
                Objects.equals(btext, that.btext) &&
                Objects.equals(bdate, that.bdate) &&
                Objects.equals(bimage, that.bimage) &&
                Objects.equals(btitle, that.btitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, buid, btext, bdate, bimage, btitle);
    }
}
