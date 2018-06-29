
package target;

public class Client {

	public static void main(String[] args) {
		Client c = new Client();
		c.teste();
	}

	public void teste() {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.request();
	}
}
