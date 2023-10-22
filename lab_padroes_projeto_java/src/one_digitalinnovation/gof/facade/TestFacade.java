package one_digitalinnovation.gof.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		facade.migrarCliente("igor", "1234567");
	}

}
/*O padrão Facade é um dos padrões de projeto estruturais e fornece uma interface simplificada
* para um conjunto de interfaces em um subsistema. Ele oculta a complexidade do subsistema e 
* fornece uma interface fácil de usar para os clientes.
* O Padrão de projeto Facade é um padrão de design de software usado comumente com 
* programação orientada a objetos. 
* Ele é uma analogia para uma fachada arquitetural. Um Facade é um objeto que provê 
* uma interface simplificada para um corpo de código maior, como por exemplo, uma
* biblioteca de classes. O Facade é um padrão de projeto estrutural que fornece uma 
* interface simplificada (mas limitada) para um sistema complexo de classes, biblioteca, ou
* framework.
*/