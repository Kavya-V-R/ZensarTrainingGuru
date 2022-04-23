package com.zensar.bean;

import javax.persistence.*;

@Embeddable
public class Address {

	@Column(name="dno")
	String doorNo;
	
	@Column(name="aname")
	String areaName;
	
	@Column
	String cityName;

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", areaName=" + areaName
				+ ", cityName=" + cityName + "]";
	}
}
