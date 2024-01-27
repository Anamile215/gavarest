package com.gavavision.almacen.services;

import java.util.List;
import java.util.Optional;
import com.gavavision.almacen.entity.Producto;


public interface ProductoService {

	public List<Producto> listar();
	public Optional<Producto> listarId(Integer id_produc);
	public int save(Producto p);
    public void delete(Integer id_produc);
	
	
}
