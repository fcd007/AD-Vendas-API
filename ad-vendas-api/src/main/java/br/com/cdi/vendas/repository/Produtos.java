package br.com.cdi.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cdi.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
