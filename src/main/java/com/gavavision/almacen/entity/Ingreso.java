package com.gavavision.almacen.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "Ingresos")
public class Ingreso implements Serializable {
	   /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int idIngreso;
	   private Date fecha_Ingreso;
	   private double total_Ingreso;
	   private String Observaciones;

	   @ManyToOne
	    private Proveedor proveedor;

	   @OneToOne(mappedBy = "ingreso")
	   private DetalleIngreso detalleIngreso;

	public Ingreso() {
		super();
	}

	public Ingreso(int idIngreso, Date fecha_Ingreso, double total_Ingreso, String observaciones, Proveedor proveedor,
			DetalleIngreso detalleIngreso) {
		super();
		this.idIngreso = idIngreso;
		this.fecha_Ingreso = fecha_Ingreso;
		this.total_Ingreso = total_Ingreso;
		Observaciones = observaciones;
		this.proveedor = proveedor;
		this.detalleIngreso = detalleIngreso;
	}

	public int getIdIngreso() {
		return idIngreso;
	}

	public void setIdIngreso(int idIngreso) {
		this.idIngreso = idIngreso;
	}

	public Date getFecha_Ingreso() {
		return fecha_Ingreso;
	}

	public void setFecha_Ingreso(Date fecha_Ingreso) {
		this.fecha_Ingreso = fecha_Ingreso;
	}

	public double getTotal_Ingreso() {
		return total_Ingreso;
	}

	public void setTotal_Ingreso(double total_Ingreso) {
		this.total_Ingreso = total_Ingreso;
	}

	public String getObservaciones() {
		return Observaciones;
	}

	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public DetalleIngreso getDetalleIngreso() {
		return detalleIngreso;
	}

	public void setDetalleIngreso(DetalleIngreso detalleIngreso) {
		this.detalleIngreso = detalleIngreso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
