
package adapter;

public class Conector2Pinos {

    public static void conectar(Plugue2Pinos p2) {
        System.out.println(p2.getClass().getName() + " conectado.");
    }    
    
    public static void conectar2(Plugue2Pinos p2) {
        System.out.println(new StringBuilder().append(p2.getClass().getName())
                                              .append(" conectado."));
    }      
}
