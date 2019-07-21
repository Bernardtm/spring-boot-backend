package com.btm.backend.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btm.backend.domain.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
