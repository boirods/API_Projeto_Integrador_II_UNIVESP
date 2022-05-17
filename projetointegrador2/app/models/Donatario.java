package models;

import java.util.UUID;

/**
 * Classe que representa as pessoas que recebem as doações.
 * @author rodrigo
 * 
 */
public class Donatario {
	private UUID id;
	private String nome;
	private String sobreNome;
	private String email;
	private String senha;
	
	public Donatario() {
		this.id=UUID.randomUUID();
	}
	
	public Donatario(String nome, String email, String senha) {
		this.id=UUID.randomUUID();
		this.nome=nome;
		this.email=email;
		this.senha=senha;
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public UUID getId() {
		return id;
	}
	
}