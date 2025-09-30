package com.ugr.sda.repository;

import com.ugr.sda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
	// Búsqueda por nombre o descripción (contiene, insensible a mayúsculas)
	List<Producto> findByNombreContainingIgnoreCaseOrDescripcionContainingIgnoreCase(String nombre, String descripcion);

	// Filtrado por categoría
	List<Producto> findByCategoria(String categoria);

	// Filtrado por disponibilidad
	List<Producto> findByDisponible(Boolean disponible);
}
