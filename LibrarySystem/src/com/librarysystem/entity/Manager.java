package com.librarysystem.entity;
/**
 * ����Ա��
 * @author NULL
 *
 */
public class Manager{
	//����Աid
	private int mid;
	//����
	private String name;
	//����֤��
	private String wordcardnum;
	//�˺�
	private String account;
	//����
	private String password;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWordcardnum() {
		return wordcardnum;
	}
	public void setWordcardnum(String wordcardnum) {
		this.wordcardnum = wordcardnum;
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
	public Manager(){
		super();
	}
	//
	public Manager(int mid, String name, String wordcardnum, String account, String password) {
		super();
		this.mid = mid;
		this.name = name;
		this.wordcardnum = wordcardnum;
		this.account = account;
		this.password = password;
	}
	
	
}
