package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "Users", schema = "liff", catalog = "")
        public class UsersEntity {
            private Long userid;
            private String upassword;
            private String uquestion1;
            private String uquestion2;
            private String uAnswer1;
            private String uAnswer2;

            public UsersEntity(Long userid,String upassword, String uquestion1,String uAnswer1, String uQuestion2,  String uAnswer2) {
                this.userid= userid;
                this.upassword = upassword;
                this.uquestion1 = uquestion1;
                this.uquestion2 = uQuestion2;
        this.uAnswer1 = uAnswer1;
        this.uAnswer2 = uAnswer2;
    }
    public UsersEntity(){

    }
    public UsersEntity(Long uid)
    {
        this.userid=uid;
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
    @Column(name = "Uquestion2")
    public String getuquestion2() {
        return uquestion2;
    }

    public void setuquestion2(String uquestion2) {
        this.uquestion2 = uquestion2;
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
                Objects.equals(uquestion2, that.uquestion2) &&
                Objects.equals(uAnswer1, that.uAnswer1) &&
                Objects.equals(uAnswer2, that.uAnswer2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, upassword, uquestion1, uquestion2, uAnswer1, uAnswer2);
    }
}
