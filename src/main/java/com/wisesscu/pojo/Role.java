package com.wisesscu.pojo;

import java.sql.Timestamp;

/**
 * ��ɫ��
 * 
 * ��Ŀ���ƣ�base_spring_framework �����ƣ�Role �������� �����ˣ�huangx ����ʱ�䣺2015��1��27�� ����6:42:22
 * �޸��ˣ�huangx �޸�ʱ�䣺2015��1��27�� ����6:42:22 �޸ı�ע��
 * 
 * @version 1.0
 * 
 */
public class Role {
	
	private Integer		id;
	private String		roleName;		// ��ɫ����
	private Integer		state;			// ״̬��0=���ᣬ1=����
	private Timestamp	insertTime;	// ����ʱ��
	private String		description;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	public Timestamp getInsertTime() {
		return insertTime;
	}
	
	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}
	
}
