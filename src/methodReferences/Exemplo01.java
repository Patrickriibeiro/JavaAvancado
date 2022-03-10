package methodReferences;

@FunctionalInterface //Essa anotação só permite um metodo abstrato na interface.
interface Figura2D {
	Retangulo desenha(Double larg, Double altura);
}

class Retangulo {
	public Retangulo(Double larg, Double altura) {
		System.out.println("Desenha retangulo de Largura: " + larg + " e Altura: " + altura);
	}
}

public class Exemplo01 {

	public static void main(String[] args) {

		// Lambda Expression
		//Figura2D fig1 = (l, a) -> System.out.println("Desenha retangulo de Largura: " + l + " e Altura: " + a);
		//fig1.desenha(8.0, 1.5);

		//Objeto especifico
		//Retangulo ret = new Retangulo();
		
		// Method Reference invocado atraves do objeto
		//Figura2D fig2 = ret::desenhaRetangulo;

		//fig2.desenha(2.0, 3.0);
		
		
		Figura2D fig1 = Retangulo::new;
		
		fig1.desenha(10.0,2.5);
		
		
	}

}
