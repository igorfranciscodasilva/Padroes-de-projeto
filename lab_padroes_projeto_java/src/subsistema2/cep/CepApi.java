package subsistema2.cep;

public class CepApi {
	private static CepApi instancia = new CepApi(); // instancia atribuida diretamente na variavel

	private CepApi() {    // No padrão de projeto singleton o construtor deve ser privado.
		super();		
	}
	public static CepApi getInstancia() {  //retorna a instancia que tem staticamente.
		return instancia;
	}
	public String recuperarCidade(String cep) {
		return "Uberlândia";
	}
	public String recuperarEstado(String cep) {
		return "MG";
	}
}
//subsistema criado para interagir com o padrão facade