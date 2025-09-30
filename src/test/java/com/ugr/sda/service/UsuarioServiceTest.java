package com.ugr.sda.service;

import com.ugr.sda.model.Usuario;
import com.ugr.sda.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioServiceTest {
    @Test
    public void findAllReturnsList() {
        UsuarioRepository repo = Mockito.mock(UsuarioRepository.class);
        Mockito.when(repo.findAll()).thenReturn(Collections.emptyList());
        UsuarioService service = new UsuarioService(repo);
        List<Usuario> usuarios = service.findAll();
        assertNotNull(usuarios);
        assertEquals(0, usuarios.size());
    }

    @Test
    public void buscarPorNombreOApellidosDevuelveResultados() {
        UsuarioRepository repo = Mockito.mock(UsuarioRepository.class);
        Usuario user = new Usuario();
        user.setNombre("Juan");
        user.setApellidos("Pérez");
        Mockito.when(repo.findByNombreContainingIgnoreCaseOrApellidosContainingIgnoreCase("juan", "juan"))
                .thenReturn(List.of(user));
        UsuarioService service = new UsuarioService(repo);
        List<Usuario> resultado = service.buscarPorNombreOApellidos("juan");
        assertEquals(1, resultado.size());
        assertEquals("Juan", resultado.get(0).getNombre());
    }

    @Test
    public void filtrarPorRolDevuelveResultados() {
        UsuarioRepository repo = Mockito.mock(UsuarioRepository.class);
        Usuario user = new Usuario();
        user.setRol("ADMIN");
        Mockito.when(repo.findByRol("ADMIN")).thenReturn(List.of(user));
        UsuarioService service = new UsuarioService(repo);
        List<Usuario> resultado = service.filtrarPorRol("ADMIN");
        assertEquals(1, resultado.size());
        assertEquals("ADMIN", resultado.get(0).getRol());
    }

    @Test
    public void filtrarPorActivoDevuelveResultados() {
        UsuarioRepository repo = Mockito.mock(UsuarioRepository.class);
        Usuario user = new Usuario();
        user.setActivo(true);
        Mockito.when(repo.findByActivo(true)).thenReturn(List.of(user));
        UsuarioService service = new UsuarioService(repo);
        List<Usuario> resultado = service.filtrarPorActivo(true);
        assertEquals(1, resultado.size());
        assertTrue(resultado.get(0).getActivo());
    }
}
