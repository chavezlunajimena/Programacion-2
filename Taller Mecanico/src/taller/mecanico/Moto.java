package taller.mecanico;

public class Moto extends Vehiculo implements Reparable {
    public Moto(String marca){
        super(marca);
    }
    public void reparar(){
        System.out.println("La moto " + marca + " esta siendo reparada");
    }
}
