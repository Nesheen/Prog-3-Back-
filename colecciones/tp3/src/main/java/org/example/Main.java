package org.example;

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("LIQ1","Pepito Juarez");
        Curso curso2 = new Curso("SEO2","Marcos Perez");
        Curso curso3 = new Curso("JUE2","Juan Tamagnone");
        Curso curso4 = new Curso("DSA3","Bruno Catroppa");

        HashMap<String,Curso> cursos = new HashMap<>();


        cursos.put(curso1.getNombre(),curso1);
        cursos.put(curso2.getNombre(),curso2);
        cursos.put(curso3.getNombre(),curso3);
        cursos.put(curso4.getNombre(),curso4);

        System.out.println(cursos.get("LIQ1"));
        System.out.println(cursos.get("LIQ5"));
        System.out.println(cursos.get("SEO2"));

        for (Map.Entry<String,Curso> entry : cursos.entrySet()){
            String clave = entry.getKey();
            Curso valor = entry.getValue();

            System.out.println("Clave:"+ clave + "| Valor:"+ valor);
        }
    }
}