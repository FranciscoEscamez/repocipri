package com.example.demo.dto;

import java.time.LocalDate;

public class Pedido {

	private double precio;
	private Estado estado;
	private LocalDate fecha;
	private Usuario userData;
		
	public Pedido(double precio, Estado estado, LocalDate fecha, Usuario userData) {
		super();
		this.precio = precio;
		this.estado = estado;
		this.fecha = fecha;
		this.userData = userData;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Usuario getUserData() {
		return userData;
	}
	public void setUserData(Usuario userData) {
		this.userData = userData;
	}
	
	
}
