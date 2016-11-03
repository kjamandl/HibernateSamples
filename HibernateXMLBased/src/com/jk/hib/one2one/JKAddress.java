package com.jk.hib.one2one;

public class JKAddress {
private Long addressId;
private String area;
private String city;
private String state;
private String pincode;

public Long getAddressId() {
	return addressId;
}
public void setAddressId(Long addressId) {
	this.addressId = addressId;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
}
