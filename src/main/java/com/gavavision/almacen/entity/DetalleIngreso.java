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
@Table(name = "DetalleIngresos")
public class DetalleIngreso implements Serializable {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id_Detaing;
	   private int cantidad_Ing;
	   private double precioUni;
	   private double total_Ing;
	   
	  @OneToOne
	  private Ingreso ingreso;
	   
	  @ManyToOne
	  private Producto producto;

	public DetalleIngreso() {
		super();
	}

	public DetalleIngreso(int id_Detaing, int cantidad_Ing, double precioUni, double total_Ing, Ingreso ingreso,
			Producto producto) {
		super();
		this.id_Detaing = id_Detaing;
		this.cantidad_Ing = cantidad_Ing;
		this.precioUni = precioUni;
		this.total_Ing = total_Ing;
		this.ingreso = ingreso;
		this.producto = producto;
	}

	public int getId_Detaing() {
		return id_Detaing;
	}

	public void setId_Detaing(int id_Detaing) {
		this.id_Detaing = id_Detaing;
	}

	public int getCantidad_Ing() {
		return cantidad_Ing;
	}

	public void setCantidad_Ing(int cantidad_Ing) {
		this.cantidad_Ing = cantidad_Ing;
	}

	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	public double getTotal_Ing() {
		return total_Ing;
	}

	public void setTotal_Ing(double total_Ing) {
		this.total_Ing = total_Ing;
	}

	public Ingreso getIngreso() {
		return ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
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
