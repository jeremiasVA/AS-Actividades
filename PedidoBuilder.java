import java.util.ArrayList;
import java.util.List;

class Pedido{
    private List<Producto> productos;
    private String cliente;

    public Pedido(String cliente, List<Producto> productos){
        this.cliente = cliente;
        this.productos = productos;
    }

    public List<Producto> getProductos(){
        return productos;
    }
    public String getCliente(){
        return cliente;
    }
}

class PedidoBuilder{
    private List<Producto> productos = new ArrayList<>();
    private String cliente;

    public PedidoBuilder setCliente(String cliente){
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder agregarProducto(Producto p){
        productos.add(p);
        return this;
    }

    public Pedido build(){
        return new Pedido(cliente, productos);
    }
}