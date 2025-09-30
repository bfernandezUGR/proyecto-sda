package com.ugr.sda.controller;

import com.ugr.sda.model.Producto;
import com.ugr.sda.service.ProductoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Página de inicio: catálogo
    @GetMapping("/")
    public String catalogo(Model model) {
        model.addAttribute("productos", productoService.findAll());
        return "catalogo";
    }

    // API REST para gestión (opcional, si se quiere mantener)
    @GetMapping("/api/productos")
    @ResponseBody
    public List<Producto> getAll() {
        return productoService.findAll();
    }

    @PostMapping("/api/productos")
    @ResponseBody
    public Producto create(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @DeleteMapping("/api/productos/{id}")
    @ResponseBody
    public void delete(@PathVariable Long id) {
        productoService.deleteById(id);
    }
}
