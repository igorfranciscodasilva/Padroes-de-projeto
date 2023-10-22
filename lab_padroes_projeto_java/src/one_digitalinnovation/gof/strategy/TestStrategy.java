package one_digitalinnovation.gof.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);		
		robo.mover();
		robo.mover();
		
		robo.setComportamento(agressivo);		
		robo.mover();
		robo.mover();
	}

}
/* O padrão Strategy é um dos padrões de projeto comportamentais e permite que você altere 
 * dinamicamente o comportamento de um objeto encapsulando-o em diferentes estratégias. 
 * Esse padrão permite que um objeto escolha entre vários algoritmos e comportamentos em tempo 
 * de execução, em vez de escolher estaticamente apenas um.
*/