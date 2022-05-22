package br.univesp.projetoIntegrador2.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Model;

/**
 * Classe que representa uma doação no sistema.
 * @author rodrigo
 */
@Entity
public class Doacao extends Model{
	@Id
	private UUID id;
	@Column
	private Date dataPublicacao;
	@Column
	private Date dataRecebimento;
	private List<Item> itens;
	
	public Doacao() {
		this.id = UUID.randomUUID();
		this.dataPublicacao = new Date();
	}
	
	public Doacao(Date dataPublicacao, List<Item> itens) {
		this.id = UUID.randomUUID();
		this.dataPublicacao = new Date();
		this.itens = itens;
	}
	
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	
	public Date getDataRecebimento() {
		return dataRecebimento;
	}
	
	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	
	public List<Item> getItens() {
		return itens;
	}
	
	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	public UUID getId() {
		return id;
	}
}
