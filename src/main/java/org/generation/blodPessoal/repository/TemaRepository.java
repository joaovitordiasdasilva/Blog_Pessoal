package org.generation.blodPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.generation.blodPessoal.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {

	/**
	 * Metodo utilizado para realizar pesquisa pela coluna tema da tabela tema
	 * 
	 * @param tema
	 * @return List com Tema
	 * @author Turma34
	 * @since 1.0
	 * 
	 */
	public List<Tema> findAllByTemaContainingIgnoreCase(String tema);

}