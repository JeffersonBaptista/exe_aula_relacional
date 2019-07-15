package com.br.relacaotabelas.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class LoginModel implements Serializable{
	private static final long serilVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Campo Apelido é obrigatorio")
	@Size(min = 2, message = "ApelidoA deve ter no minimo 2 letras")
	private String apelido;
	
	@NotBlank(message = "Campo Senha é obrigatorio")
	@Size(min = 6, message = "Nome deve ter no minimo 6 caracteres")
	private String senha;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private UsuarioModel usuario;

	public LoginModel() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	
	

}
