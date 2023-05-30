package br.com.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository  extends JpaRepository<ItemPedido, Integer>{

}
