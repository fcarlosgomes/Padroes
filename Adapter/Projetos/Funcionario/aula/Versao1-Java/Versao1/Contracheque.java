package versao1;

public class Contracheque {
	private Funcionario f;

	void setFuncionario(Funcionario f) {
		this.f = f;
	}
	
	String pegarPrimeiroNome() {
		return this.f.getPrimeiroNome();
	}
}
