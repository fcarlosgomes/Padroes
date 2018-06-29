package pkg;

public class EmpregadoImpl implements Empregado {
	private String nomeCompleto;

	public void setNomeCompleto(String n) {
		nomeCompleto = n;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
}