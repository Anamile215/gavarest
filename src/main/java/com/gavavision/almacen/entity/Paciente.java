package com.gavavision.almacen.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "Pacientes")
public class Paciente implements Serializable{
	   /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int idpacientes;
	   private String identificacion;
	   private String nombres;
	   private String apellidos;
	   private String email;
	   private String celular;

	   @OneToMany(mappedBy = "paciente")
	   private List<Egreso>egreso;

	public Paciente() {
		super();
	}

	public Paciente(int idpacientes, String identificacion, String nombres, String apellidos, String email,
			String celular, List<Egreso> egreso) {
		super();
		this.idpacientes = idpacientes;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.celular = celular;
		this.egreso = egreso;
	}

	public int getIdpacientes() {
		return idpacientes;
	}

	public void setIdpacientes(int idpacientes) {
		this.idpacientes = idpacientes;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public List<Egreso> getEgreso() {
		return egreso;
	}

	public void setEgreso(List<Egreso> egreso) {
		this.egreso = egreso;
	}



}
