package com.gavavision.almacen.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavavision.almacen.entity.Producto;
import com.gavavision.almacen.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	
	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id_produc) {
		return productoRepository.findById(id_produc);
	}

	@Override
	public void update(Producto producto) {
		productoRepository.save(producto);
		
	}

	@Override
	public void delete(Integer id_produc) {
		productoRepository.deleteById(id_produc);
		
	}

	@Override
	public List<Producto> findAll() {
		return productoRepository.findAll();
	}

}
