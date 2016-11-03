package com.jk.hib.one2one;

public class JKEmployee {
	private Long empId;
	private String name;
	private JKAddress address;

	public JKAddress getAddress() {
		return address;
	}

	public void setAddress(JKAddress address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}
}
