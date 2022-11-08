package com.example.comercioAPI.Repository;

import com.example.comercioAPI.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

    //@Query (value="select from ClienteAPI where nome like %?1%")
    List<Cliente> findByNome (String nome);
}
