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
    @Table(name = "Proveedores")
    public class Proveedor implements Serializable {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idproveedores;
	    private String nit;
	    private String razonsocial;
	    private String telefono;
	    private String direccion;
	    private String ciudad;
	    
	    
	   @OneToMany(mappedBy = "proveedor")
	   private List<Ingreso>ingreso;


	public Proveedor() {
		super();
	}


	public Proveedor(int idproveedores, String nit, String razonsocial, String telefono, String direccion,
			String ciudad, List<Ingreso> ingreso) {
		super();
		this.idproveedores = idproveedores;
		this.nit = nit;
		this.razonsocial = razonsocial;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.ingreso = ingreso;
	}


	public int getIdproveedores() {
		return idproveedores;
	}


	public void setIdproveedores(int idproveedores) {
		this.idproveedores = idproveedores;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getRazonsocial() {
		return razonsocial;
	}


	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public List<Ingreso> getIngreso() {
		return ingreso;
	}


	public void setIngreso(List<Ingreso> ingreso) {
		this.ingreso = ingreso;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
	   
	   
}
