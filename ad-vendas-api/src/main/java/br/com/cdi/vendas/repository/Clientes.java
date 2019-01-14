package br.com.cdi.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cdi.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
