package com.example.comercioAPI.Repository;

import com.example.comercioAPI.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository <Produto, Integer> {
}
