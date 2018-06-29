package pkg;

public class ClientedeTeste {
	public static void main(String args[]) {
		EmpregadoImpl empregado = new EmpregadoImpl();
		empregado.setNomeCompleto("Getúlio Vargas");
		Funcionario funcionario = new FuncionarioImpl2(empregado);
		System.out.println("Nome completo: " + empregado.getNomeCompleto());
		System.out.println("");
		System.out.println("Primeiro nome: " + funcionario.getPrimeiroNome());
		System.out.println("Sobrenome ...: " + funcionario.getSobrenome());
	}
}