package com.gavavision.almacen.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gavavision.almacen.entity.Producto;
import com.gavavision.almacen.services.ProductoService;



@Controller
@RequestMapping("/productos")
public class ProductoController {



    @Autowired
    private ProductoService productoService;

	@GetMapping("/verProductos")
	public String listar(ModelMap model) {
		List<Producto>productos=productoService.listar();
		model.addAttribute("productos",productos);
		return "productos/verProductos";
	}

	@GetMapping("/crearProductos")
	public String crearProductos(ModelMap model) {
		model.addAttribute("producto", new Producto());
		return "productos/crearProductos";
	}


	@PostMapping("/save")
     public String save (@Validated Producto p, ModelMap model) {
 		productoService.save(p);
 		return "redirect:/productos/verProductos";
	}

	@GetMapping("/crearProductos/{id_produc}")
	public String editar (@PathVariable Integer id_produc, ModelMap model) {
		Optional<Producto>producto=productoService.listarId(id_produc);
		model.addAttribute("producto", producto);
		return "productos/crearProductos";
	}

	@GetMapping("/verProductos/{id_produc}")
	public String delete(ModelMap model,@PathVariable int id_produc) {
		productoService.delete(id_produc);
		return "redirect:/productos/verProductos";
		
	}

}
