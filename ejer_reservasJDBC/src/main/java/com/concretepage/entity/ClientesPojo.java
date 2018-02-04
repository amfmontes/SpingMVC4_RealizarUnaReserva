package com.concretepage.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")


public class ClientesPojo implements Serializable{
	java.text.SimpleDateFormat formato2= new SimpleDateFormat("dd/MM/y"); 
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	private String fechaEntrada;
	private String fechaSalida;
	private int idcasa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getFechaEntrada() {
		return formato2.format(fechaEntrada);
	}
	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public String getFechaSalida() {
		return formato2.format(fechaSalida);
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
		
	}
	public int getIdcasa() {
		return idcasa;
	}
	public void setIdcasa(int idcasa) {
		this.idcasa = idcasa;
	}

}
