package biblioteca;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList <materialBliblioteca> materiales = new Arraylist();
        materiales.add(new Libro("978-0156012195", "Nieblas", 1943, "Antoine de Saint"));
        materiales.add(new Revista("National Geographic", "Harry Styles", 336, 2023));
        materiales.add(new DVD("Matrix", "Lana Wachowski", 160, 1999));
        
        for(materialBliblioteca material : materiales){
            System.out.println(material);
        }
    }
    
}
