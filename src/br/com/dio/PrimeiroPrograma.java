package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		
		
		/*int a = 5;
		int b = 5;		
		System.out.println("Bem vindo ao meu primeiro programa !! =) e voc� � nota " + (a+b));*/
		
	}

}

class Livros {
	private String nome;
	private String npag;
}
