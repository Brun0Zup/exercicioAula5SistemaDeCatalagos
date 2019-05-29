package com.br.exercicio.catalago;

public class Item {
	
	// Atributos

	private String nome;
	private String categoria;

	// Construtor

	public Item(String nome, String categoria) {
		super();
		this.nome = nome;
		this.categoria = categoria;

		// Getters e Setters
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
