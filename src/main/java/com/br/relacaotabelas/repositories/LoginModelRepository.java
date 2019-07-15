package com.br.relacaotabelas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.relacaotabelas.models.LoginModel;

@Repository
public interface LoginModelRepository extends CrudRepository<LoginModel, Integer> {

}
