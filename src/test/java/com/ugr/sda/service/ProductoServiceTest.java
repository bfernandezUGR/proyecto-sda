package com.ugr.sda.service;

import com.ugr.sda.model.Producto;
import com.ugr.sda.repository.ProductoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ProductoServiceTest {
    @Test
    void findAllReturnsList() {
        ProductoRepository repo = Mockito.mock(ProductoRepository.class);
        Mockito.when(repo.findAll()).thenReturn(Collections.emptyList());
        ProductoService service = new ProductoService(repo);
        List<Producto> productos = service.findAll();
        assertNotNull(productos);
        assertEquals(0, productos.size());
    }
}
