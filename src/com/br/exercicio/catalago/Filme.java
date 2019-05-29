package com.br.exercicio.catalago;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Item {

	// Atributos

	private String genero;
	private int duracao;
	private List<String> atores = new ArrayList<String>();

	// Construtor

	public Filme(String nome, String categoria, String genero, int duracao, List<String> atores) {
		super(nome, categoria);
		this.genero = genero;
		this.duracao = duracao;
		this.atores = atores;

		// Getters e Setters

	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public List<String> getAtores() {
		return atores;
	}

	public void setAtores(List<String> atores) {
		this.atores = atores;
	}

	public String toString() {

		String modelo = "";

		modelo += " O Nome ->" + super.getNome() + "\n";
		modelo += " A categoria ->" + super.getCategoria() + "\n";
		modelo += " O genero ->" + this.getGenero() + "\n";
		modelo += " A duração ->" + this.getDuracao() + "\n";
		modelo += " A lista ->" + this.getAtores() + "\n";

		return modelo;
	}
}
