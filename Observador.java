import java.util.List;
import java.util.ArrayList;

interface Observador{
    void actualizar(Pedido p);
}

class ClienteNotificador implements Observador{
    public void actualizar(Pedido p){
        System.out.println("Notificando al cliente: Pedido de " + p.getCliente() + " registrado exitosamente :D");
    }
}

class Cocinero implements Observador{
    public void actualizar(Pedido p){
        System.out.println("Cocinero preparando pedido de: " + p.getCliente());
    }
}

class GestorPedidos{
    private List<Observador> observadores = new ArrayList<>();
    private PedidoDAO pedidoDAO = new PedidoDAO();

    public void agregarObservador(Observador o){
        observadores.add(o);
    }

    public void registrarPedido(Pedido p){
        pedidoDAO.guardarPedido(p);
        notificar(p);
    }

    private void notificar(Pedido p){
        for(Observador o : observadores){
            o.actualizar(p);
        }
    }

    public PedidoDAO getPedidoDAO(){
        return pedidoDAO;
    }
}