package com.zensar.bean;

public class Address {
String doorNumber;
String areaName;
String cityName;
public String getDoorName() {
	return doorNumber;
}
public void setDoorNumber(String doorName) {
	this.doorNumber = doorNumber;
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
	return "Address [doorNumber=" + doorNumber + ", areaName=" + areaName
			+ ", cityName=" + cityName + "]";
}

}
