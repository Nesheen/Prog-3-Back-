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

        //uso un for each por que sino se muestra uno al lado del otro
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

    }
}