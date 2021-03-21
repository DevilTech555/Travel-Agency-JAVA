package com.saarathi.beans;

import java.sql.Date;

public class Leave {
	private int id;
	private int employee_id;
	private int type_id;
	private String leave_status;
	private Date leave_from;
	public Leave(int id, int employee_id, int type_id, String leave_status, Date leave_from) {
		super();
		this.id = id;
		this.employee_id = employee_id;
		this.type_id = type_id;
		this.leave_status = leave_status;
		this.leave_from = leave_from;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getLeave_status() {
		return leave_status;
	}
	public void setLeave_status(String leave_status) {
		this.leave_status = leave_status;
	}
	public Date getLeave_from() {
		return leave_from;
	}
	public void setLeave_from(Date leave_from) {
		this.leave_from = leave_from;
	}
	@Override
	public String toString() {
		return "Leave [id=" + id + ", employee_id=" + employee_id + ", type_id=" + type_id + ", leave_status="
				+ leave_status + ", leave_from=" + leave_from + "]";
	}
}
