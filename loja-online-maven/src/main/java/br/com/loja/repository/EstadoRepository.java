package br.com.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.domain.Estado;

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Integer>{

}
