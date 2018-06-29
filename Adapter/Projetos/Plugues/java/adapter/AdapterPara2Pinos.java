
package adapter;

// adaptador deve ter o MESMO tipo da classe de saída (Plugue2Pinos)
// ou seja, o adaptador deve ter a mesma interface da classe de saída
public class AdapterPara2Pinos extends Plugue2Pinos{

    Plugue3Pinos plugue3Pinos;

    public AdapterPara2Pinos(Plugue3Pinos p3) {
        this.plugue3Pinos = p3;
    }
}
