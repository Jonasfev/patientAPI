package br.com.jonasfev.fullstackweek.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonasfev.fullstackweek.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
