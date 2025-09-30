package com.ugr.sda.controller;

import com.ugr.sda.model.Usuario;
import com.ugr.sda.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioService.findAll();
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping("/buscar/{usuario}")
    public Usuario findByUsuario(@PathVariable String usuario) {
        return usuarioService.findByUsuario(usuario);
    }
}
