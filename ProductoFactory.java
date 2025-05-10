abstract class ProductoFactory{
    public abstract Producto crearProducto(String tipo);
}

class BebidaFactory extends ProductoFactory{
    public Producto crearProducto(String tipo){
        Producto producto = null;
        if(tipo.equalsIgnoreCase("Cafe")){
            producto = new Cafe();
        }
        return producto;
    }
}

class ComidaFactory extends ProductoFactory{
    public Producto crearProducto(String tipo){
        Producto producto = null;

        if(tipo.equalsIgnoreCase("Postre")){
            producto = new Postre();
        }else if(tipo.equalsIgnoreCase("Sandwich")){
            producto = new Sandwich();
        }
        
        return producto;
    }
}