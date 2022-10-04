package com.app.atlasultimate.repository;

import com.app.atlasultimate.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Cliente, Integer > {

}
