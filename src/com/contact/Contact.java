package com.contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contact {

	private Name name;
	private PhoneticName pname;
	private Organisation organisation;
	private Map<Types, Phone> phone = new HashMap<>();
	private Map<Types, Email> email = new HashMap<>();
	private List<IM> im = new ArrayList<>();
	private Address address;
	private String notes;
	private List<Website> web = new ArrayList<>();
	private Groups groupname;
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public PhoneticName getPname() {
		return pname;
	}
	public void setPname(PhoneticName pname) {
		this.pname = pname;
	}
	public Organisation getOrganisation() {
		return organisation;
	}
	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}
	public Map<Types, Phone> getPhone() {
		return phone;
	}
	public void setPhone(Map<Types, Phone> phone) {
		this.phone = phone;
	}
	public Map<Types, Email> getEmail() {
		return email;
	}
	public void setEmail(Map<Types, Email> email) {
		this.email = email;
	}
	public List<IM> getIm() {
		return im;
	}
	public void setIm(List<IM> im) {
		this.im = im;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public List<Website> getWeb() {
		return web;
	}
	public void setWeb(List<Website> web) {
		this.web = web;
	}
	public Groups getGroupname() {
		return groupname;
	}
	public void setGroupname(Groups groupname) {
		this.groupname = groupname;
	}
	
	

	
}
