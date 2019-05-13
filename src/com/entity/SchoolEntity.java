package com.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "school", schema = "liff", catalog = "")
public class SchoolEntity {
    private String spschool;
    private String smschool;
    private String shschool;
    private String suschool;
    private Integer spgrade;
    private Integer smgrade;
    private Integer shgrade;
    private Integer sugrade;

    @Basic
    @Column(name = "Spschool")
    public String getSpschool() {
        return spschool;
    }

    public void setSpschool(String spschool) {
        this.spschool = spschool;
    }

    @Basic
    @Column(name = "Smschool")
    public String getSmschool() {
        return smschool;
    }

    public void setSmschool(String smschool) {
        this.smschool = smschool;
    }

    @Basic
    @Column(name = "Shschool")
    public String getShschool() {
        return shschool;
    }

    public void setShschool(String shschool) {
        this.shschool = shschool;
    }

    @Basic
    @Column(name = "Suschool")
    public String getSuschool() {
        return suschool;
    }

    public void setSuschool(String suschool) {
        this.suschool = suschool;
    }

    @Basic
    @Column(name = "Spgrade")
    public Integer getSpgrade() {
        return spgrade;
    }

    public void setSpgrade(Integer spgrade) {
        this.spgrade = spgrade;
    }

    @Basic
    @Column(name = "Smgrade")
    public Integer getSmgrade() {
        return smgrade;
    }

    public void setSmgrade(Integer smgrade) {
        this.smgrade = smgrade;
    }

    @Basic
    @Column(name = "Shgrade")
    public Integer getShgrade() {
        return shgrade;
    }

    public void setShgrade(Integer shgrade) {
        this.shgrade = shgrade;
    }

    @Basic
    @Column(name = "Sugrade")
    public Integer getSugrade() {
        return sugrade;
    }

    public void setSugrade(Integer sugrade) {
        this.sugrade = sugrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolEntity that = (SchoolEntity) o;
        return Objects.equals(spschool, that.spschool) &&
                Objects.equals(smschool, that.smschool) &&
                Objects.equals(shschool, that.shschool) &&
                Objects.equals(suschool, that.suschool) &&
                Objects.equals(spgrade, that.spgrade) &&
                Objects.equals(smgrade, that.smgrade) &&
                Objects.equals(shgrade, that.shgrade) &&
                Objects.equals(sugrade, that.sugrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spschool, smschool, shschool, suschool, spgrade, smgrade, shgrade, sugrade);
    }
}
