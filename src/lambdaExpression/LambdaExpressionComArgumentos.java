package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

class Produto {

	private String nome;
	private Double preco;

	Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void imprime() {
		System.out.println(nome + " " + preco);
	}

}

class Impressora {

	public static void imprime(Produto produto) {
		System.out.println(produto.getNome() + " " + produto.getPreco());
	}

}

public class LambdaExpressionComArgumentos {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();

		lista.add(new Produto("TV 42", 2000.00));
		lista.add(new Produto("Geladeira", 1000.00));
		lista.add(new Produto("Fogão", 100.00));
		lista.add(new Produto("VideoGame", 1900.00));

		// Lambda expression com argumento
		lista.forEach(produto -> System.out.println(produto.getNome() + " " + produto.getPreco()));

		// Lambda expression com 2 argumentos
		lista.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

		lista.forEach(produto -> System.out.println(produto.getNome() + " " + produto.getPreco()));

		// Lambda com multiplas linhas
		lista.forEach(produto -> {
			System.out.println(produto.getNome());
			System.out.println(produto.getPreco());
		});
        
		//Method Reference invocado atraves de uma classe com metodo estático.
		lista.forEach(Impressora::imprime);
		
		//Method Reference invocado atraves de uma classe.
		lista.forEach(Produto::imprime);

	}
}
