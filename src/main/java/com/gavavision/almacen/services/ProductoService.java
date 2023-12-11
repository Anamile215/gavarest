package com.gavavision.almacen.services;

import java.util.List;
import java.util.Optional;
import com.gavavision.almacen.entity.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
    public Optional<Producto> get(Integer id_produc);
    public void update(Producto producto);
    public void delete(Integer id_produc);
    public List<Producto> findAll();
}
