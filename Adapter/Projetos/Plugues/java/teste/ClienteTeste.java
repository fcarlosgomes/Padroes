package teste;

import adapter.AdapterPara2Pinos;
import adapter.Conector2Pinos;
import adapter.Plugue2Pinos;
import adapter.Plugue3Pinos;

public class ClienteTeste {

	public static void main(String[] args) {
		Plugue2Pinos p2a = new Plugue2Pinos();
		Plugue3Pinos p3 = new Plugue3Pinos();

		Conector2Pinos.conectar(p2a);
		// Conector2Pinos.conectar(p3); // Erro: sem adaptador

		Plugue2Pinos p2b = new AdapterPara2Pinos(p3);
		Plugue2Pinos p2c = new AdapterPara2Pinos(new Plugue3Pinos());

		Conector2Pinos.conectar(p2b);
		Conector2Pinos.conectar(p2c);

		Conector2Pinos.conectar(new AdapterPara2Pinos(p3));
		Conector2Pinos.conectar2(new AdapterPara2Pinos(p3));
	}
}
