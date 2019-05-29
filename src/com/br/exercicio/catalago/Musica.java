package com.br.exercicio.catalago;

public class Musica extends Item{
	
	// Atributos
	private String cantor;
	private String banda;
	private String genero;
	
	// Construtor
	
	public Musica(String nome, String categoria, String cantor, String banda, String genero) {
		super(nome, categoria);
		this.cantor = cantor;
		this.banda = banda;
		this.genero = genero;
	}
	
	// Getters e Setters

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {

		String modelo = "";

		modelo += " O Nome ->" + super.getNome() + "\n";
		modelo += " A categoria ->" + super.getCategoria() + "\n";
		modelo += " O Cantor(a) ->" + this.getCantor() + "\n";
		modelo += " A banda ->" + this.getBanda() + "\n";
		modelo += " O genero ->" + this.getGenero() + "\n";

		return modelo;
	}
}
