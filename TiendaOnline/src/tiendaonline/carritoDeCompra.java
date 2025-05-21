package tiendaonline;

import java.util.ArrayList;

 class carritoDeCompra {
    private ArrayList<Producto> productos;
    
    public carritoDeCompra(){
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public double calcularTotal(){
        double total = 0;
        for(Producto p : productos){
            total += p.calcularPrecioFinal();
        }
        return total;
    }
    
    public void mostrarDetalle(){
        for(Producto p: productos){
            System.out.println("Producto\n" + p.getNombre() + " " + p.getMarca() + " " + "Precio: $" + p.calcularPrecioFinal());
        }
        System.out.println("TOTAL: $" + calcularTotal());
    }
}
