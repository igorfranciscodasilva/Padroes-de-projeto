package one_digitalinnovation.gof.strategy;

public class Robo {
	private Comportamento comportamento;  // interface comportamento e a interface strategy

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	public void mover() {
		comportamento.mover();
	}
}
