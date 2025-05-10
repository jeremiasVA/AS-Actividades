public interface Producto{
    String getDescripcion();
    double getPrecio();
}

class Cafe implements Producto{
    public String getDescripcion(){
        return "Cafe";
    }
    public double getPrecio(){
        return 2.5;
    }
}

class Postre implements Producto{
    public String getDescripcion(){
        return "Postre";
    }
    public double getPrecio(){
        return 3.0;
    }
}

class Sandwich implements Producto{
    public String getDescripcion(){
        return "Sandwich";
    }
    public double getPrecio(){
        return 4.0;
    }
}