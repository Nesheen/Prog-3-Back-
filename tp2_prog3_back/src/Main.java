import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creación de los estudiantes
        Estudiante est1 = new Estudiante("Juan Peréz",25,"Arquitectura");
        Estudiante est2 = new Estudiante("Juan Segundo",28,"Plomeria");
        Estudiante est3 = new Estudiante("Armando Estebanquito",30,"Carpinteria");
        Estudiante est4 = new Estudiante("Santiago López",22,"Ing Industrial");
        Estudiante est5 = new Estudiante("Jessica Adams",21,"Desarrollo de Interiores");

        //creo un array list cosa que ademas de almacenarlos sea flexible
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);
        estudiantes.add(est4);
        estudiantes.add(est5);

        Curso curso_1 = new Curso("LIC 1", "Pepe Franchesco");

        curso_1.agregarEstudiante(new Estudiante("Pepe Argento"));
        curso_1.agregarEstudiante(new Estudiante("San Martin"));
        curso_1.agregarEstudiante(new Estudiante("Martin Palermo"));

        System.out.println(curso_1.toString());




    }
}