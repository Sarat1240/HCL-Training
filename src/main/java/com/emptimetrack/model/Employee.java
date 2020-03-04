package com.emptimetrack.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "employee")
public class Employee {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long empId;
   private String empName;
   private Date swipeInTime;
   private Date swipeOutTime;
   private String location;
	   
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getSwipeInTime() {
		return swipeInTime;
	}
	public void setSwipeInTime(Date swipeInTime) {
		this.swipeInTime = swipeInTime;
	}
	public Date getSwipeOutTime() {
		return swipeOutTime;
	}
	public void setSwipeOutTime(Date swipeOutTime) {
		this.swipeOutTime = swipeOutTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
		
}
