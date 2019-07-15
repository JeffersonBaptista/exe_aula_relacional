package com.br.relacaotabelas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.relacaotabelas.models.LoginModel;
import com.br.relacaotabelas.models.UsuarioModel;
import com.br.relacaotabelas.repositories.LoginModelRepository;
import com.br.relacaotabelas.repositories.UsuarioModelRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioModelRepository usuarioRepository;
	@Autowired
	private LoginModelRepository loginRepository;
	
	public void salvarUsuario(UsuarioModel usuario, LoginModel login) {
		login.setUsuario(usuario);
		loginRepository.save(login);
	}
	
	public Iterable<UsuarioModel> exibirUsuarios(){
		return usuarioRepository.findAll();
	}

}
