package com.ugr.sda.service;

import com.ugr.sda.model.Producto;
import com.ugr.sda.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoServiceTest {
    @Test
    public void findAllReturnsList() {
        ProductoRepository repo = Mockito.mock(ProductoRepository.class);
        Mockito.when(repo.findAll()).thenReturn(Collections.emptyList());
        ProductoService service = new ProductoService(repo);
        List<Producto> productos = service.findAll();
        assertNotNull(productos);
        assertEquals(0, productos.size());
    }

    @Test
    public void buscarPorNombreODescripcionDevuelveResultados() {
        ProductoRepository repo = Mockito.mock(ProductoRepository.class);
        Producto prod = new Producto();
        prod.setNombre("Camiseta UGR");
        prod.setDescripcion("Oficial");
        Mockito.when(repo.findByNombreContainingIgnoreCaseOrDescripcionContainingIgnoreCase("camiseta", "camiseta"))
                .thenReturn(List.of(prod));
        ProductoService service = new ProductoService(repo);
        List<Producto> resultado = service.buscarPorNombreODescripcion("camiseta");
        assertEquals(1, resultado.size());
        assertEquals("Camiseta UGR", resultado.get(0).getNombre());
    }

    @Test
    public void filtrarPorCategoriaDevuelveResultados() {
        ProductoRepository repo = Mockito.mock(ProductoRepository.class);
        Producto prod = new Producto();
        prod.setCategoria("Servicios");
        Mockito.when(repo.findByCategoria("Servicios")).thenReturn(List.of(prod));
        ProductoService service = new ProductoService(repo);
        List<Producto> resultado = service.filtrarPorCategoria("Servicios");
        assertEquals(1, resultado.size());
        assertEquals("Servicios", resultado.get(0).getCategoria());
    }

    @Test
    public void filtrarPorDisponibilidadDevuelveResultados() {
        ProductoRepository repo = Mockito.mock(ProductoRepository.class);
        Producto prod = new Producto();
        prod.setDisponible(true);
        Mockito.when(repo.findByDisponible(true)).thenReturn(List.of(prod));
        ProductoService service = new ProductoService(repo);
        List<Producto> resultado = service.filtrarPorDisponibilidad(true);
        assertEquals(1, resultado.size());
        assertTrue(resultado.get(0).getDisponible());
    }
}
