package adapter.classAdapter;

public class Cliente {

    public static void main(String[] args) {
        InterfaceCliente existente = new Adaptador();
        existente.mostrar();
    }
}
