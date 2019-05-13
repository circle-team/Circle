package com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "bloginfo", schema = "liff", catalog = "")
public class BloginfoEntity {
    private long bid;
    private String btext;
    private Timestamp bdate;
    private String bimage;
    private String btitle;

    @Id
    @Column(name = "Bid")
    public long getBid() {
        return bid;
    }

    public void setBid(long bid) {
        this.bid = bid;
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
        BloginfoEntity that = (BloginfoEntity) o;
        return bid == that.bid &&
                Objects.equals(btext, that.btext) &&
                Objects.equals(bdate, that.bdate) &&
                Objects.equals(bimage, that.bimage) &&
                Objects.equals(btitle, that.btitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, btext, bdate, bimage, btitle);
    }
}
