package com.gavavision.almacen.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



 
 @Entity
 @Table(name = "Productos")
 public class Producto implements Serializable {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int id_produc;
	   private String nombre;
	   private String lote;
	   private String registro_sanitario;
	   private double precio;
	   private Date fecha_vencimiento;
	   private int existencia;
	   
	  @OneToMany(mappedBy = "producto")
	  private List<DetalleIngreso>detalleIngreso;
	  
	  @OneToMany(mappedBy = "producto")
	  private List<DetalleEgreso>detalleegreso;

	public Producto() {
		super();
	}

	public Producto(int id_produc, String nombre, String lote, String registro_sanitario, double precio,
			Date fecha_vencimiento, int existencia, List<DetalleIngreso> detalleIngreso,
			List<DetalleEgreso> detalleegreso) {
		super();
		this.id_produc = id_produc;
		this.nombre = nombre;
		this.lote = lote;
		this.registro_sanitario = registro_sanitario;
		this.precio = precio;
		this.fecha_vencimiento = fecha_vencimiento;
		this.existencia = existencia;
		this.detalleIngreso = detalleIngreso;
		this.detalleegreso = detalleegreso;
	}

	public int getId_produc() {
		return id_produc;
	}

	public void setId_produc(int id_produc) {
		this.id_produc = id_produc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getRegistro_sanitario() {
		return registro_sanitario;
	}

	public void setRegistro_sanitario(String registro_sanitario) {
		this.registro_sanitario = registro_sanitario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public List<DetalleIngreso> getDetalleIngreso() {
		return detalleIngreso;
	}

	public void setDetalleIngreso(List<DetalleIngreso> detalleIngreso) {
		this.detalleIngreso = detalleIngreso;
	}

	public List<DetalleEgreso> getDetalleegreso() {
		return detalleegreso;
	}

	public void setDetalleegreso(List<DetalleEgreso> detalleegreso) {
		this.detalleegreso = detalleegreso;
	}

	@Override
	public String toString() {
		return "Producto [id_produc=" + id_produc + ", nombre=" + nombre + ", lote=" + lote + ", registro_sanitario="
				+ registro_sanitario + ", precio=" + precio + ", fecha_vencimiento=" + fecha_vencimiento
				+ ", existencia=" + existencia + ", detalleIngreso=" + detalleIngreso + ", detalleegreso="
				+ detalleegreso + "]";
	}
	  
	  
}
