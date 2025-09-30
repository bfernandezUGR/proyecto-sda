package com.ugr.sda.repository;

import com.ugr.sda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuario(String usuario);

    // Buscar por nombre o apellidos (contiene, insensible a mayúsculas)
    List<Usuario> findByNombreContainingIgnoreCaseOrApellidosContainingIgnoreCase(String nombre, String apellidos);

    // Filtrar por rol
    List<Usuario> findByRol(String rol);

    // Filtrar por estado activo
    List<Usuario> findByActivo(Boolean activo);
}
