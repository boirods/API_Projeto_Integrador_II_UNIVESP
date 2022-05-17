package models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Classe que representa uma doação.
 * @author rodrigo
 *
 */
public class Doacao {
	private UUID id;
	private List<Item> itens;
	private Date dataPublicacao;
	private Date dataRecepcao;
	
	public Doacao() {
		this.id=UUID.randomUUID();
		this.dataPublicacao=new Date();
	}
	
	public Doacao(List<Item> itens) {
		this.id=UUID.randomUUID();
		this.dataPublicacao=new Date();
		this.itens=itens;
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	
	public Date getDataRecepcao() {
		return dataRecepcao;
	}
	
	public void setDataRecepcao(Date dataRecepcao) {
		this.dataRecepcao = dataRecepcao;
	}
	
	public UUID getId() {
		return id;
	}
}