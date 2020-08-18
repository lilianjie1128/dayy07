package com.bw.bean;

public class Student {
	private Integer sid;
	private String sname;
	private String sex;
	private String picurl;
	private Integer cid;
	private String cname;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPicurl() {
		return picurl;
	}
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student(Integer sid, String sname, String sex, String picurl, Integer cid, String cname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.picurl = picurl;
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", picurl=" + picurl + ", cid=" + cid
				+ ", cname=" + cname + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
