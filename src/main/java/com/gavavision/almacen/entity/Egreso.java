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
@Table(name = "Egresos")
public class Egreso implements Serializable{
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int idEgresos;
	   private Date fecha_Egreso;
	   private double total_Egreso;
	   
	   @ManyToOne
	   private Paciente paciente;
	   
	   @OneToOne(mappedBy = "egreso")
	   private DetalleEgreso detalleEgreso;

	public Egreso() {
		super();
	}

	public Egreso(int idEgresos, Date fecha_Egreso, double total_Egreso, Paciente paciente,
			DetalleEgreso detalleEgreso) {
		super();
		this.idEgresos = idEgresos;
		this.fecha_Egreso = fecha_Egreso;
		this.total_Egreso = total_Egreso;
		this.paciente = paciente;
		this.detalleEgreso = detalleEgreso;
	}

	public int getIdEgresos() {
		return idEgresos;
	}

	public void setIdEgresos(int idEgresos) {
		this.idEgresos = idEgresos;
	}

	public Date getFecha_Egreso() {
		return fecha_Egreso;
	}

	public void setFecha_Egreso(Date fecha_Egreso) {
		this.fecha_Egreso = fecha_Egreso;
	}

	public double getTotal_Egreso() {
		return total_Egreso;
	}

	public void setTotal_Egreso(double total_Egreso) {
		this.total_Egreso = total_Egreso;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public DetalleEgreso getDetalleEgreso() {
		return detalleEgreso;
	}

	public void setDetalleEgreso(DetalleEgreso detalleEgreso) {
		this.detalleEgreso = detalleEgreso;
	}
	   
	   

}
