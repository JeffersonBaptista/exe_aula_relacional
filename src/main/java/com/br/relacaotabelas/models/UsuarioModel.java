package com.br.relacaotabelas.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class UsuarioModel implements Serializable {
	private static final long serilVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Campo nome é obrigatorio")
	@Size(min = 2, message = "Nome deve ter no minimo 2 letras")
	private String nome;
	
	@NotBlank(message = "Campo nome é obrigatorio")
	@Size(min = 2, message = "SobreNome deve ter no minimo 2 letras")
	private String sobreNome;

	@NotBlank(message = "Campo eMail é obrigatorio")
	@Email(message = "eMail invalido")
	private String email;
	
	@OneToOne(mappedBy = "usuario")
	private LoginModel login;

	public UsuarioModel() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LoginModel getLogin() {
		return login;
	}

	public void setLogin(LoginModel login) {
		this.login = login;
	}
	
	

}
