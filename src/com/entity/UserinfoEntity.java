package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "userinfo", schema = "liff", catalog = "")
public class UserinfoEntity {
    private String ugender;
    private String ucontact;
    private String uname;
    private String uaddress;
    private String uemail;
    private String uidentityNumber;
    private String uimage;
    private String uhobby;

    @Basic
    @Column(name = "Ugender")
    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    @Basic
    @Column(name = "Ucontact")
    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    @Basic
    @Column(name = "Uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "Uaddress")
    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    @Basic
    @Column(name = "Uemail")
    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    @Basic
    @Column(name = "UidentityNumber")
    public String getUidentityNumber() {
        return uidentityNumber;
    }

    public void setUidentityNumber(String uidentityNumber) {
        this.uidentityNumber = uidentityNumber;
    }

    @Basic
    @Column(name = "Uimage")
    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    @Basic
    @Column(name = "Uhobby")
    public String getUhobby() {
        return uhobby;
    }

    public void setUhobby(String uhobby) {
        this.uhobby = uhobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserinfoEntity that = (UserinfoEntity) o;
        return Objects.equals(ugender, that.ugender) &&
                Objects.equals(ucontact, that.ucontact) &&
                Objects.equals(uname, that.uname) &&
                Objects.equals(uaddress, that.uaddress) &&
                Objects.equals(uemail, that.uemail) &&
                Objects.equals(uidentityNumber, that.uidentityNumber) &&
                Objects.equals(uimage, that.uimage) &&
                Objects.equals(uhobby, that.uhobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ugender, ucontact, uname, uaddress, uemail, uidentityNumber, uimage, uhobby);
    }
}
