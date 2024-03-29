package com.gavavision.almacen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gavavision.almacen.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
