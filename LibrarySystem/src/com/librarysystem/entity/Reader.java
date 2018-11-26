package com.librarysystem.entity;

public class Reader {
	private int rid;
	private String name;
	private String librarycardnum;
	private String account;
	private String password;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLibrarycardnum() {
		return librarycardnum;
	}
	public void setLibrarycardnum(String librarycardnum) {
		this.librarycardnum = librarycardnum;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Reader(){
		super();
	}
	
	public Reader(int rid, String name, String librarycardnum, String account, String password) {
		super();
		this.rid = rid;
		this.name = name;
		this.librarycardnum = librarycardnum;
		this.account = account;
		this.password = password;
	}
	
	
}
