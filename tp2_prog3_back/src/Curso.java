import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private String profesor;

    public Curso(String nombre,String profesor) {
        this.nombre=nombre;
        this.profesor=profesor;
        this.estudiantes= new ArrayList<>();
    }

     public int getCantidadEstudiantes(){
        return estudiantes.size();
     }

     public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
     }

    @Override
    public String toString() {
        return  "Curso:"+ nombre + "\n" +
                "Profesor:" + profesor + "\n" +
                "Cantidad de estudiantes:"+ getCantidadEstudiantes();
    }
}