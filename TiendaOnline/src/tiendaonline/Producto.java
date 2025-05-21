package tiendaonline;

class Producto {
    protected String nombre;
    protected double precioBase;
    protected String marca;
    protected double descuento;
    String calcularPrecioFinal;

    public Producto(String nombre, double precioBase, String marca, double descuento) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.marca = marca;
        this.descuento = descuento;
    }
    
    public double calcularPrecioFinal(){
        return precioBase * (1 - descuento);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    public String getMarca(){
        return marca;
    }
}
