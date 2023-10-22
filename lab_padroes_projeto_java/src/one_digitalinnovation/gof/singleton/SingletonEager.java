package one_digitalinnovation.gof.singleton;

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager(); // instancia atribuida diretamente na variavel

	private SingletonEager() {    // No padrão de projeto singleton o construtor deve ser privado.
		super();		
	}
	public static SingletonEager getInstancia() {  //retorna a instancia que tem staticamente.
		return instancia;
	}
}

