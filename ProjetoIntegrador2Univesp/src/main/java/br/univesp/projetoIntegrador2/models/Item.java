package br.univesp.projetoIntegrador2.models;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.ebean.Model;

/**
 * Classe que representa um item
 * @author rodrigo
 */
@Entity
public class Item extends Model{
	@Id
	private UUID id;
	@Column
	private String descricao;
	@Column
	private int quantidade;
	
	public Item() {
		this.id = UUID.randomUUID();
	}
	
	public Item(String descricao, int quantidade) {
		this.id=UUID.randomUUID();
		this.descricao=descricao;
		this.quantidade=quantidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public UUID getId() {
		return id;
	}
}
