package versao1;

public class Funcionario {
	private String primeiroNome;
	private String sobrenome;
	
	public Funcionario (String primeiroNome, String sobrenome) {
		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
	}

	String getPrimeiroNome() {
		return this.primeiroNome;
	}
	
	String getSobrenome() {
		return this.sobrenome;
	}	
}
