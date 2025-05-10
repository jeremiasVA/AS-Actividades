abstract class ProductoDecorador implements Producto{
    protected Producto producto;
    public ProductoDecorador(Producto p){
        this.producto = p;
    }
}

class ConExtraLeche extends ProductoDecorador{
    public ConExtraLeche(Producto p){
        super(p);
    }
    public String getDescripcion(){
        return producto.getDescripcion() + " con extra leche";
    }
    public double getPrecio(){
        return producto.getPrecio() + 0.5;
    }
}

class TamañoGrande extends ProductoDecorador{
    public TamañoGrande(Producto p){
        super(p);
    }
    public String getDescripcion(){
        return producto.getDescripcion() + " tamaño grande";
    }
    public double getPrecio(){
        return producto.getPrecio() + 1.0;
    }
}

class SinAzucar extends ProductoDecorador{
    public SinAzucar(Producto p){
        super(p);
    }
    public String getDescripcion(){
        return producto.getDescripcion() + " sin azucar";
    }
    public double getPrecio(){
        return producto.getPrecio();
    }
}