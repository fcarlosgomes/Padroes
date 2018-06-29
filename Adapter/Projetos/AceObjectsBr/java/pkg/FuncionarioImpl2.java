package pkg;

public class FuncionarioImpl2 implements Funcionario {
	EmpregadoImpl empregado;
	String primeiroNome;
	String sobrenome;

	public FuncionarioImpl2(EmpregadoImpl a) {
		empregado = a;
		primeiroNome = empregado.getNomeCompleto().split(" ")[0];
		sobrenome = empregado.getNomeCompleto().split(" ")[1];
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setPrimeiroNome(String p) {
		primeiroNome = p;

	}

	public void setSobrenome(String s) {
		sobrenome = s;

	}
}
