package com.example.comercioAPI.Controller;

import com.example.comercioAPI.Model.Cliente;
import com.example.comercioAPI.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/ClienteAPI")
public class ControlCliente {

    @Autowired
    ClienteRepository clRepo;

    @GetMapping ("/ClienteBuscarCod/{codigo}")
    public Optional<Cliente> buscarCodigo (@PathVariable(value="codigo") int codigo)
    {
        return clRepo.findById(codigo);
    }

    @GetMapping ("/ClienteBuscarNome/{nome}")
    public List<Cliente> buscarNome (@PathVariable(value="nome") String nome)
    {
        return clRepo.findByNome(nome);
    }
}
