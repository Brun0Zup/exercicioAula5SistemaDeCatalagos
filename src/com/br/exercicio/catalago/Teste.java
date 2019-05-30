package com.br.exercicio.catalago;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		List<String> atores = new ArrayList<String>();

		int controle = 1;
		while (controle == 1) {

			System.out.println(
					"(1) Adicionar Filme;\n"
			+ "(2) Adicionar Livro;\n" 
							+ "(3) Adicionar Música;\n" 
			+ "(4) Para sair");

			int verificador = entrada.nextInt();

			if (verificador == 1) {
			
					atores.add("Paul Walker");
					atores.add("Vin Diesel");
					atores.add("Ja rule");

					Filme filme = new Filme("Velozes e furiosos", "Ação", "Suspense", 120, atores);
					System.out.println(filme);

			} else if (verificador == 2) {

				Livro livro = new Livro("Startup enxuta", "Empreendedorismo", "Eric ries", 340);
				System.out.println(livro);

			} else if (verificador == 3) {

				Musica musica = new Musica("Olhos de tigre", "Rap", "Djonga", "Pineaple", "Rap+");
				System.out.println(musica);

			} else if (verificador == 4) {
				controle = 0;
			}
		}
	}
}
