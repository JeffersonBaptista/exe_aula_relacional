package com.br.relacaotabelas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.relacaotabelas.models.LoginModel;
import com.br.relacaotabelas.repositories.LoginModelRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginModelRepository loginRepository;
	
	public void salvarLogin(LoginModel login) {
		loginRepository.save(login);
	}
	

}
