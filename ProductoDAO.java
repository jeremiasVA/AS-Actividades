import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProductoDAO{
    public List<Producto> listarProductos(){
        return Arrays.asList(new Cafe(), new Postre(), new Sandwich());
    }
}

class PedidoDAO{
    private List<Pedido> pedidos = new ArrayList<>();

    public void guardarPedido(Pedido p){
        pedidos.add(p);
    }
    public List<Pedido> listarPedidos(){
        return pedidos;
    }
}