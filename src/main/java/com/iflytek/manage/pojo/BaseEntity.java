package com.iflytek.manage.pojo;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.iflytek.manage.common.DateFormatConverter;

public class BaseEntity {

	private Date createdTime;
	private Date modifiedTime;
	private String createdUser;
	private String modifiedUser;
	@JsonSerialize(using=DateFormatConverter.class)
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	@JsonSerialize(using=DateFormatConverter.class)
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	
	
}
