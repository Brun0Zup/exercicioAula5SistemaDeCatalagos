package com.br.exercicio.catalago;

public class Livro extends Item{
	
	//Atributos
	
	private String autor;
	private int paginas;
	
	// Construtor
	
	public Livro (String nome, String categoria, String autor, int paginas) {
		super(nome, categoria);
		this.autor = autor;
		this.paginas = paginas;
	}

	// Getters e Setters
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public String toString() {

		String modelo = "";

		modelo += " O Nome ->" + super.getNome() + "\n";
		modelo += " A categoria ->" + super.getCategoria() + "\n";
		modelo += " O autor(a) ->" + this.getAutor() + "\n";
		modelo += " A qtd de Pag ->" + this.getPaginas() + "\n";

		return modelo;
	}
}
