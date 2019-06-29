package adapter.adapter1.objectAdapter;

//Classe Cliente(Client)
public class Teclado {
    public static void main(String[] args) {
        EntradaPS2 ps2 = new EntradaPS2();
        AdapterEntrada adaptador = new AdapterEntrada(ps2);
        adaptador.conectarEntradaUSB();
    }
}
