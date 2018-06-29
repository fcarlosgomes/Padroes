package versao1;

public class Cliente {
	
	public static void main(String[] args) {
		new Cliente().processar();
	}
	
	void processar() {
		Funcionario func = new Funcionario("Lucas", "Christian");
		Contracheque c = new Contracheque();
		
		c.setFuncionario(func);
		System.out.println(c.pegarPrimeiroNome());
	}
}
