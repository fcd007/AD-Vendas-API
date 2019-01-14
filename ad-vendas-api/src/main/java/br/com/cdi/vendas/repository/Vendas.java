package br.com.cdi.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cdi.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
