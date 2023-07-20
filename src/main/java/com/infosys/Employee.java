package com.infosys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_MVCtable")
public class Employee {
	@Id
	@Column(name="eid")
	int eid;
	@Column(name="ename")
	String ename;
	@Column(name="sal")
	int sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int eid, String ename, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}