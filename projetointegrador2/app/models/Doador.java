package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Classe que representa um doador.
 * @author rodrigo
 *
 */
public class Doador {
	private UUID id;
	private String nome;
	private String sobreNome;
	private String email;
	private String senha;
	private String telefone;
	private List<Doacao> doacoes;
	public Doador() {
		this.id=UUID.randomUUID();
		doacoes = new ArrayList<Doacao>();
	}
	
	public Doador(String nome, String email, String senha) {
		this.id=UUID.randomUUID();
		this.nome=nome;
		this.email=email;
		this.senha=senha;
		this.doacoes=new ArrayList<Doacao>();
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<Doacao> getDoacoes() {
		return doacoes;
	}
	
	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	}
	
	public UUID getId() {
		return id;
	}
}
