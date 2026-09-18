package jar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jar.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
