package com.vn.ejemplospring.demospring.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * los @ son decoradores existen un patron de diseño de decoracion,
 * 
 * @author PC
 *
 */

@Entity // esto y el id lo define el import java.persistence
public class CuentaBanc implements Serializable {

	@Id
	//esto quiere decir que el campo es autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min = 1, max = 16)
	@NotNull
	private String iban;
	
	
	private String dni;

	// el contructor por defecto es necesario porque
	// hibernate (junto a jpa) necesita poder construir el objeto
	// y luego mapear las propiedades en tablas
	public CuentaBanc() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "CuentaBanc [id=" + id + ", iban=" + iban + ", dni=" + dni + "]";
	}
	
	
}
