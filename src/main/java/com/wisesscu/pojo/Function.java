package com.wisesscu.pojo;

import java.sql.Timestamp;

/**
 * 
 * ��Ŀ���ƣ�base_spring_framework �����ƣ�Function �������� �����ˣ�huangx ����ʱ�䣺2015��1��27��
 * ����6:38:12 �޸��ˣ�huangx �޸�ʱ�䣺2015��1��27�� ����6:38:12 �޸ı�ע��
 * 
 * @version 1.0
 * 
 */
public class Function {
	
	private int				id;
	private int				parentId;			// ��Id
	private String		functionName;	// ��������
	private int				state;				// ״̬��0=���ᣬ1=����
	private int				display;			// �Ƿ���ʾ��0=����ʾ��1=��ʾ
	private String		action;				// ����·��
	private String		icon;					// ͼ��
	private int				desc;					// ����
	private Timestamp	insertTime;		// ����ʱ��
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getParentId() {
		return parentId;
	}
	
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	public String getFunctionName() {
		return functionName;
	}
	
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public int getDesc() {
		return desc;
	}
	
	public void setDesc(int desc) {
		this.desc = desc;
	}
	
	public Timestamp getInsertTime() {
		return insertTime;
	}
	
	public void setInsertTime(Timestamp insertTime) {
		this.insertTime = insertTime;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public int getDisplay() {
		return display;
	}
	
	public void setDisplay(int display) {
		this.display = display;
	}
	
}
