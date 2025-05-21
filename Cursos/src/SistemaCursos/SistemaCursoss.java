package SistemaCursos;

import java.util.ArrayList;

public class SistemaCursoss {

    public static void main(String[] args) {
        // Crear cursos
        Curso cursoJava = new Curso("Java Basico", 40);
        Curso cursoPython = new Curso("Python Intermedio", 50);
        Curso cursoWeb = new Curso("Desarrollo Web", 60);
        
        // Crear estudiantes
        Estudiante est1 = new Estudiante("Ana", "Lopez", 12345678, 1001, cursoJava);
        Estudiante est2 = new Estudiante("Carlos", "Gomez", 23456789, 1002, cursoPython);
        Estudiante est3 = new Estudiante("Maria", "Perez", 34567890, 1003, cursoWeb);
        
        ArrayList <Estudiante> listaEstudiante = new ArrayList();
        listaEstudiante.add(est1);
        listaEstudiante.add(est2);
        listaEstudiante.add(est3);
        
        for(Estudiante estu : listaEstudiante){
            System.out.println(estu);
        }
        
    }
    
}
