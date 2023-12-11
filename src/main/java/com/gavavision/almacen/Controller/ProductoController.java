package com.gavavision.almacen.Controller;

import org.slf4j.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gavavision.almacen.entity.Producto;
import com.gavavision.almacen.services.ProductoService;




@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	
	private final Logger LOGGER=  LoggerFactory.getLogger(ProductoController.class);
	
    @Autowired
    private ProductoService productoService;
	
	@GetMapping("/verProductos")
	public String verProductos(ModelMap model){	
      model.addAttribute("productos",productoService.findAll());
        return "productos/verProductos";
    }

	@GetMapping("/crearProductos")
	public String crearProductos() {
		return "productos/crearProductos";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("este es el objeto producto{}",producto);
		productoService.save(producto);
		return "redirect:/productos";
	}
	
}
