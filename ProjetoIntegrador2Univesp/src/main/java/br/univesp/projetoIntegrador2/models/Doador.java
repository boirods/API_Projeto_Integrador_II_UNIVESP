package br.univesp.projetoIntegrador2.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Model;

/**
 * Classe que representa um doador no sistema.
 * @author rodrigo
 */
@Entity
public class Doador extends Model{
	@Id
	private UUID id;
	@Column
	private String nome;
	@Column
	private String sobrenome;
	@Column
	private String email;
	@Column
	private String senha;
	@Column
	private String telefone;
	
	public Doador() {
		this.id = UUID.randomUUID();
	}
	
	public Doador(String nome, String email, String senha) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public UUID getId() {
		return id;
	}
}
/*
 *package br.univesp.projetoIntegrador2.models;
@Entity
public class Donatario extends Model{
	@Id
	private UUID id;
	@Column
	private String nome;
	@Column
	private String sobrenome;
	@Column
	private String email;
	@Column
	private String senha;
	private List<Doacao> itensRecebidos;
	
	public Donatario() {
		this.id = UUID.randomUUID();
	}
	
	public Donatario(String nome, String email, String senha) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Doacao> getItensRecebidos() {
		return itensRecebidos;
	}
	
	public void setItensRecebidos(List<Doacao> itensRecebidos) {
		this.itensRecebidos = itensRecebidos;
	}
	
	public UUID getId() {
		return id;
	}
}
 
 */
