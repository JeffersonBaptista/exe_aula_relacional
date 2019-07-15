package com.br.relacaotabelas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.relacaotabelas.models.LoginModel;
import com.br.relacaotabelas.models.UsuarioModel;

@Repository
public interface UsuarioModelRepository extends CrudRepository<UsuarioModel, Integer>{

}
