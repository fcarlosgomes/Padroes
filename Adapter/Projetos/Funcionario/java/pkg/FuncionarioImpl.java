package pkg;

public class FuncionarioImpl implements Funcionario {
	private String primeiroNome;
	private String sobreNome;

	public void setPrimeiroNome(String p) {
		this.primeiroNome = p;
	}

	public void setSobrenome(String s) {
		this.sobreNome = s;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getSobrenome() {
		return sobreNome;
	}

}
