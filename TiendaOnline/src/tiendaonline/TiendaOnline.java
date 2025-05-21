package tiendaonline;

public class TiendaOnline {

    public static void main(String[] args) {
        carritoDeCompra carrito = new carritoDeCompra();

        Producto tele = new Electrodomestico("TV", 50000, "LCD", 0.15);
        Producto blazer = new Ropa("Blazer", 10000, "Zara", 0.10);
        Producto heladera = new Electrodomestico("Heladera", 80000, "LG", 0.20);
        Producto pantalon = new Ropa("Pantalon", 12000, "Levi's", 0.05);
        Producto microondas = new Electrodomestico("Microondas", 25000, "Philips", 0.10);
        Producto remera = new Ropa("Remera", 8000, "Nike", 0.25);

        carrito.agregarProducto(tele);
        carrito.agregarProducto(blazer);
        carrito.agregarProducto(heladera);
        carrito.agregarProducto(pantalon);
        carrito.agregarProducto(microondas);
        carrito.agregarProducto(remera);
        carrito.mostrarDetalle();
    }
  
}
