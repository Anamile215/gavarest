package com.gavavision.almacen.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "DetalleEgresos")
public class DetalleEgreso implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id_Detaegr;
	   private int cantidad_Egr;
	   private double precioUni;
	   private double total_Egr;
	   
	   @OneToOne
	   private Egreso egreso;
	   
	   @ManyToOne
	   private Producto producto;

	public DetalleEgreso() {
		super();
	}

	public DetalleEgreso(int id_Detaegr, int cantidad_Egr, double precioUni, double total_Egr, Egreso egreso,
			Producto producto) {
		super();
		this.id_Detaegr = id_Detaegr;
		this.cantidad_Egr = cantidad_Egr;
		this.precioUni = precioUni;
		this.total_Egr = total_Egr;
		this.egreso = egreso;
		this.producto = producto;
	}

	public int getId_Detaegr() {
		return id_Detaegr;
	}

	public void setId_Detaegr(int id_Detaegr) {
		this.id_Detaegr = id_Detaegr;
	}

	public int getCantidad_Egr() {
		return cantidad_Egr;
	}

	public void setCantidad_Egr(int cantidad_Egr) {
		this.cantidad_Egr = cantidad_Egr;
	}

	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	public double getTotal_Egr() {
		return total_Egr;
	}

	public void setTotal_Egr(double total_Egr) {
		this.total_Egr = total_Egr;
	}

	public Egreso getEgreso() {
		return egreso;
	}

	public void setEgreso(Egreso egreso) {
		this.egreso = egreso;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	   
	   
	   
}
