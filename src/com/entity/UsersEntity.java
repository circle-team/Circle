package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Users", schema = "liff", catalog = "")
public class UsersEntity {
    private long userid;
    private String upassword;
    private String uquestion1;
    private String uQuestion2;
    private String uAnswer1;
    private String uAnswer2;

    public UsersEntity(long userid, String upassword, String uquestion1, String uQuestion2, String uAnswer1, String uAnswer2) {
        this.userid = userid;
        this.upassword = upassword;
        this.uquestion1 = uquestion1;
        this.uQuestion2 = uQuestion2;
        this.uAnswer1 = uAnswer1;
        this.uAnswer2 = uAnswer2;
    }

    @Id
    @Column(name = "Userid")
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "Upassword")
    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Basic
    @Column(name = "Uquestion1")
    public String getUquestion1() {
        return uquestion1;
    }

    public void setUquestion1(String uquestion1) {
        this.uquestion1 = uquestion1;
    }

    @Basic
    @Column(name = "UQuestion2")
    public String getuQuestion2() {
        return uQuestion2;
    }

    public void setuQuestion2(String uQuestion2) {
        this.uQuestion2 = uQuestion2;
    }

    @Basic
    @Column(name = "UAnswer1")
    public String getuAnswer1() {
        return uAnswer1;
    }

    public void setuAnswer1(String uAnswer1) {
        this.uAnswer1 = uAnswer1;
    }

    @Basic
    @Column(name = "UAnswer2")
    public String getuAnswer2() {
        return uAnswer2;
    }

    public void setuAnswer2(String uAnswer2) {
        this.uAnswer2 = uAnswer2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return userid == that.userid &&
                Objects.equals(upassword, that.upassword) &&
                Objects.equals(uquestion1, that.uquestion1) &&
                Objects.equals(uQuestion2, that.uQuestion2) &&
                Objects.equals(uAnswer1, that.uAnswer1) &&
                Objects.equals(uAnswer2, that.uAnswer2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, upassword, uquestion1, uQuestion2, uAnswer1, uAnswer2);
    }
}
