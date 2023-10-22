package one_digitalinnovation.gof.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);     //retorna a mesma instancia 
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);     ////retorna a mesma instancia
	}

}
/*  Lazy e Eager são nomes ficticios dado a dois tipos diferentes de utilizar o padrão de projeto Singleton.
 *  Singleton é um padrão de design que nos diz que podemos criar apenas uma instância de uma 
 *  classe e que essa instância pode ser acessada globalmente.
 *  Este é um dos tipos básicos de padrão de design. Ele garante que a classe atue como uma 
 *  única fonte de entrada para todos os componentes de consumidor que desejam acessar esse estado. 
 *  Em outras palavras, ele fornece um ponto de entrada comum para usar o estado global.
 *  Assim, uma classe singleton deve ser aquela que:
 * -Garante que ele crie apenas uma instância da classe
 * -Fornece um ponto de acesso global ao estado.
 * -Certifica-se de que a instância seja criada apenas na primeira vez.
 * 
 */
