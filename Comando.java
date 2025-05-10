interface Comando{
    void ejecutar();
}

class HacerPedidoCommand implements Comando{
    private Pedido pedido;
    private GestorPedidos gestor;

    public HacerPedidoCommand(Pedido pedido, GestorPedidos gestor){
        this.pedido = pedido;
        this.gestor = gestor;
    }

    public void ejecutar(){
        gestor.registrarPedido(pedido);
    }
}

class CancelarPedidoCommand implements Comando{
    public void ejecutar(){
        System.out.println("Pedido cancelado.");
    }
}

class Invocador{
    private Comando comando;
    public void setComando(Comando comando){
        this.comando = comando;
    }
    public void ejecutarComando(){
        comando.ejecutar();
    }
}