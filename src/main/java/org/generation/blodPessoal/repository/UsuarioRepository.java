package org.generation.blodPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.generation.blodPessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	/**
	 * Método utilizado para realizar pesquisa pela coluna email da tabela usuario
	 * 
	 * @param email
	 * @return Optional com Usuário
	 * @author Turma34
	 * @since 1.0
	 * 
	 */
	public Optional<Usuario> findByEmail(String email);

	/**
	 * Método utilizado para realizar spesquisa pela coliuna nome da tabela usuario
	 * 
	 * @param nome
	 * @return List com Usuário
	 * @author Turma34
	 * @since 1.0
	 * 
	 */
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

}
