package me.dio.repository;

import me.dio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {


}
