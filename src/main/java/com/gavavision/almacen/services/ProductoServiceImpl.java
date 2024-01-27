package com.gavavision.almacen.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavavision.almacen.entity.Producto;
import com.gavavision.almacen.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

	
	@Autowired
	private ProductoRepository productoRepository ;

	@Override
	public List<Producto> listar() {
		return (List<Producto>)productoRepository.findAll();
	}

	@Override
	public Optional<Producto> listarId(Integer id_produc) {
		return productoRepository.findById(id_produc);
	}

	@Override
	public int save(Producto p) {
		int rest=0;
		Producto producto=productoRepository.save(p);
		if(!producto.equals(null)) {
			rest=1;
		}
		return rest;
	}

	@Override
	public void delete(Integer id_produc) {
		productoRepository.deleteById(id_produc);
		
	}

	

    
	

}
