package com.br.relacaotabelas.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.relacaotabelas.models.LoginModel;
import com.br.relacaotabelas.models.UsuarioModel;
import com.br.relacaotabelas.services.LoginService;
import com.br.relacaotabelas.services.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@Autowired
	LoginService loginService;

	@GetMapping("/")
	public ModelAndView mapiarPagina() {
		ModelAndView modelAndView = new ModelAndView("cadastro.html");
		modelAndView.addObject("usuarios", usuarioService.exibirUsuarios());
		return modelAndView;
	}

	@PostMapping("/")
	public ModelAndView cadastrarUsuario(@Valid UsuarioModel usuario, BindingResult bindngUsuario,
			@Valid LoginModel login, BindingResult bindngLogin) {
		ModelAndView modelAndView = new ModelAndView("cadastro.html");

		List<String> mensagens = new ArrayList<String>();

		if (bindngUsuario.hasErrors() || bindngLogin.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			for (ObjectError object : bindngLogin.getAllErrors()) {
				erros.add(object.getDefaultMessage());
			}
			for (ObjectError object : bindngUsuario.getAllErrors()) {
				erros.add(object.getDefaultMessage());
			}
			modelAndView.addObject("erros", erros);

		} else {
			usuarioService.salvarUsuario(usuario, login);

			mensagens.add("Cadastrado com sucesso");
			modelAndView.addObject("mensagens", mensagens);
			//modelAndView.addObject("usuarios", usuarioService.exibirUsuarios());
		}

		

		return modelAndView;

	}
}
