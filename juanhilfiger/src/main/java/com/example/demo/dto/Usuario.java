package com.example.demo.dto;

public class Usuario {
	private Long ID;
	private String firstName;
	private String lastName;
	private long phone;
	private String mail;
	private String direccion;
	public Usuario(long i, String firstName, String lastName, long string, String mail, String direccion) {
		super();
		ID = i;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = string;
		this.mail = mail;
		this.direccion = direccion;
	}
	public Usuario(long i, String firstName2, String lastName2, int string, String mail2, String direccion2) {
		// TODO Auto-generated constructor stub
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
