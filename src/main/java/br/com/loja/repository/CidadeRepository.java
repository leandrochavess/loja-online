package br.com.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.domain.Cidade;

@Repository
public interface CidadeRepository  extends JpaRepository<Cidade, Integer>{

}
