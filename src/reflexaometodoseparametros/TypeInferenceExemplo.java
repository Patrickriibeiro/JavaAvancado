package reflexaometodoseparametros;

import java.util.ArrayList;
import java.util.List;
                  
class ImprimeProdutos {
	
	public static void imprime(List<Produto> lista) {
		if(!lista.isEmpty()) {
			lista.forEach(p -> System.out.println(p.getNome()));
		}
		else {
			System.out.println("Lista vazia");
		}
	}
}

public class TypeInferenceExemplo {

	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV 42'", 2000.00));
		lista.add(new Produto("Geladeira 470L'", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Videogame", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		
		//Inferência de tipo na chamada ao método especializado imprime da classe ImprimeProdutos
		ImprimeProdutos.imprime(new ArrayList<>());
		
	}

}
