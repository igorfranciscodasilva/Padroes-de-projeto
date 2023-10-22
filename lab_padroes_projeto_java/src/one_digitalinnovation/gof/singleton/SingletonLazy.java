package one_digitalinnovation.gof.singleton;

public class SingletonLazy {
	private static SingletonLazy instancia; // = new SingletonLazy() pode atribuir a instancia diretamente na variavel

	public SingletonLazy() {    // No padrão de projeto singleton o construtor deve ser privado.
		super();		
	}
	public static SingletonLazy getInstancia() { //retorna a instancia que tem staticamente.
		if(instancia == null) {   //intanciando instancia para ser retornada.
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}
