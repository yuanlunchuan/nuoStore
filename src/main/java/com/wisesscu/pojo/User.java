package com.wisesscu.pojo;

import java.sql.Timestamp;

public class User {
	private int				id;
	private String		username;
	private String		loginName;		// ��¼��
	private String		password;			// ����
	private String		displayName;	// ��ʾ����
	private String		type;					// 'normal','ca''�˺����ͣ�CA|��ͨ'
	private int				state;				// ״̬��0=���ᣬ1=����
	private String		loginIp;			// ��½IP
	private String		bindIp;				// ��IP
	private int				ipbandFlag;		// �Ƿ��
	private int				tryTimes;			// ��½ʧ�ܵĳ��Դ���������������session��Ч���ڽ�ֹ��½
	private Timestamp	lastLogintime;// ����½ʱ��
	private String		email;				// ����
	private String		contactPhone;	// �绰
	private Timestamp	insertTime;		// ����ʱ��
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public String getLoginIp() {
		return loginIp;
	}
	
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	
	public String getBindIp() {
		return bindIp;
	}
	
	public void setBindIp(String bindIp) {
		this.bindIp = bindIp;
	}
	
	public int getIpbandFlag() {
		return ipbandFlag;
	}
	
	public void setIpbandFlag(int ipbandFlag) {
		this.ipbandFlag = ipbandFlag;
	}
	
	public int getTryTimes() {
		return tryTimes;
	}
	
	public void setTryTimes(int tryTimes) {
		this.tryTimes = tryTimes;
	}
	
	public Timestamp getLastLogintime() {
		return lastLogintime;
	}
	
	public void setLastLogintime(Timestamp lastLogintime) {
		this.lastLogintime = lastLogintime;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContactPhone() {
		return contactPhone;
	}
	
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	
	public Timestamp getInsertTime() {
		return insertTime;
	}
	
	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
