package com.pojo;


public class Bloginfo {

  private long bid;
  private long buid;
  private String btext;
  private java.sql.Timestamp bdate;
  private String bimage;
  private String btitle;


  public long getBid() {
    return bid;
  }

  public void setBid(long bid) {
    this.bid = bid;
  }


  public long getBuid() {
    return buid;
  }

  public void setBuid(long buid) {
    this.buid = buid;
  }


  public String getBtext() {
    return btext;
  }

  public void setBtext(String btext) {
    this.btext = btext;
  }


  public java.sql.Timestamp getBdate() {
    return bdate;
  }

  public void setBdate(java.sql.Timestamp bdate) {
    this.bdate = bdate;
  }


  public String getBimage() {
    return bimage;
  }

  public void setBimage(String bimage) {
    this.bimage = bimage;
  }


  public String getBtitle() {
    return btitle;
  }

  public void setBtitle(String btitle) {
    this.btitle = btitle;
  }

}
