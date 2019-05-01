package adapter.objectAdapter;

public class AdapterEntrada extends EntradaUSB{

    private EntradaPS2 entradaPS2;

    public AdapterEntrada(EntradaPS2 entradaPS2) {
        this.entradaPS2 = entradaPS2;
    }

    //solicitacao
    public void conectarEntradaUSB() {
        entradaPS2.conectarEntradaPS2();
    }
}
