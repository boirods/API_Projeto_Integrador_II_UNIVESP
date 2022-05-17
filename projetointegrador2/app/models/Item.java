package models;

import java.util.UUID;

/**
 * Classe que representa um item de doação.
 * @author rodrigo
 *
 */
public class Item {
	private UUID id;
	private String descricao;
	private int quantidade;
	
	public Item() {
		this.id=UUID.randomUUID();
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