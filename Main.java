import java.util.*;

public class Main{
    public static void main(String[] args){
        ProductoDAO productoDAO = new ProductoDAO();
        List<Producto> catalogo = productoDAO.listarProductos();

        System.out.println("------------------Catalogo disponible ------------------");
        int index = 1;
        for(Producto p : catalogo){
            index++;
            System.out.println(index + ". " + p.getDescripcion() + ". precio: " + p.getPrecio() + "$");
        }

        GestorPedidos gestor = new GestorPedidos();
        gestor.agregarObservador(new ClienteNotificador());
        gestor.agregarObservador(new Cocinero());

        Producto productoCliente1 = new TamañoGrande(new ConExtraLeche(catalogo.get(0)));
        Producto productoCliente1_2 = new SinAzucar(catalogo.get(1));

        Pedido pedido1 = new PedidoBuilder().setCliente("Ana Torres").agregarProducto(productoCliente1).agregarProducto(productoCliente1_2).build();

        Producto productoCliente2 = new ConExtraLeche(catalogo.get(0));
        Producto productoCliente2_2 = catalogo.get(2);

        Pedido pedido2 = new PedidoBuilder().setCliente("Carlos Muñoz").agregarProducto(productoCliente2).agregarProducto(productoCliente2_2).build();
        Invocador invocador = new Invocador();
        Comando comando1 = new HacerPedidoCommand(pedido1, gestor);
        invocador.setComando(comando1);
        invocador.ejecutarComando();
        System.out.println();
        Comando comando2 = new HacerPedidoCommand(pedido2, gestor);
        invocador.setComando(comando2);
        invocador.ejecutarComando();

        System.out.println("\n------------------- Pedidos registrados ------------------");
        for(Pedido p : gestor.getPedidoDAO().listarPedidos()){
            System.out.println("Cliente: " + p.getCliente());
            for(Producto prod : p.getProductos()){
                System.out.println("- " + prod.getDescripcion() + ". precio: " + prod.getPrecio() + "$");
            }
            System.out.println();
        }
    }
}