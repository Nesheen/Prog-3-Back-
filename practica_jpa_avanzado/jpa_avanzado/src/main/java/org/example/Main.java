package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //inicializacion de pacientes
        List<Paciente>pacientes= List.of(
            new Paciente("Ana", "Martínez", 28, 99887766, "OSDE", LocalDate.of(1995, 2, 12), 'F'),
            new Paciente("Luis", "Fernández", 35, 44556677, "Swiss Medical", LocalDate.of(1988, 11, 5), 'M'),
            new Paciente("Sofía", "Rojas", 22, 22334455, "Galeno", LocalDate.of(2001, 7, 30), 'F'));


        //inicializacion de medicos de forma normal
        Medico medico1 = new Medico("Dr. José", "Ramírez", 48, "Cardiologia","XH09812");
        Medico medico2 = new Medico("Dra. Laura", "Sánchez",35,"Otorringolaringolo","NA1234");


        //inicializacion consultas
        List<Consulta>consultas = List.of(
                new Consulta(LocalDate.of(2025, 10, 1),"Gripe",medico1, pacientes.get(0)),
                new Consulta(LocalDate.of(2025, 10, 20), "Dolor de cabeza",medico2,pacientes.get(1)),
                new Consulta(LocalDate.of(2025, 10, 3), "Chequeo general",medico1,pacientes.get(2)),
                new Consulta(LocalDate.of(2025, 10, 14), "Otitis",medico2,pacientes.get(0)));

        //inicializacion historiales
        HistorialClinica historial1 = new HistorialClinica("Mucha fiebre y vomitos");
        HistorialClinica historial2 = new HistorialClinica("Tos y mocos");

        //inicializacion de medicamentos
        Medicamento medicamento1 = new Medicamento("Paracetamol", "Acetaminofén", 500);
        Medicamento medicamento2 = new Medicamento("Ibuprofeno", "Ibuprofeno", 400);
        Medicamento medicamento3 = new Medicamento("Amoxicilina", "Amoxicilina", 250);

        //asociar medicos con las consultas
        medico1.getConsultas().add(consultas.get(0));
        medico2.getConsultas().add(consultas.get(1));
        medico1.getConsultas().add(consultas.get(2));
        medico2.getConsultas().add(consultas.get(3));

        //asociar medicamentos con pacientes
        pacientes.get(0).setMedicamentos(medicamento1);
        pacientes.get(1).setMedicamentos(medicamento2);
        pacientes.get(2).setMedicamentos(medicamento3);

        //asociar consultas consultas con diagnosticos y nombre del paciente
        consultas.get(0).getPaciente();
        consultas.get(1).getPaciente();
        consultas.get(2).getPaciente();
        consultas.get(3).getPaciente();

        //asociar pacientes junto con su historial clinico
        pacientes.get(0).setHistorialClinica(historial1);
        pacientes.get(1).setHistorialClinica(historial2);
        pacientes.get(2).setHistorialClinica(historial1);


        //espaciado
        System.out.println("");
        //3. listar pacientes mayores de 30 años
        for(Paciente p:pacientes){
            if(p.getEdad()>30){
                System.out.println(p);
            }
        }

        //espaciado
        System.out.println("");
        //4. obtener las consultas de un medico en especifico
        System.out.println("Consultas del médico "+ medico1.getNombre()+":");
        for(Consulta c :medico1.getConsultas()){
            System.out.println(c);
        }

        //espaciado
        System.out.println("");
        //5. mostrar todos los medicamentos asociados a un paciente
        System.out.println("Medicamentos del paciente: "+pacientes.get(1).getNombre());
        for(Medicamento p: pacientes.get(1).getMedicamentos()){
            System.out.println(p);
        }

        //espaciado
        System.out.println("");
        //6.listar las consultas con sus diágnosticos y el nombre del paciente
        System.out.println("Consultas con diagnosticos de:"+ consultas.get(0).getPaciente());
        for(Consulta c:consultas){
            System.out.println(c);
        }

        //espaciado
        System.out.println("");
        //7.	Calcular el promedio de edad de los pacientes.
        double sumaEdades= 0;

        for (Paciente p : pacientes){
            sumaEdades += p.getEdad();
        }
        double promedio = (double) sumaEdades/ pacientes.size();
        System.out.println("El promedio de edad de los pacientes es de:"+ promedio);

        //espaciado
        System.out.println("");
        //8.listar todos los pacientes que tienen una obra social especifica
        for(Paciente p : pacientes){
            if ("OSDE".equals(p.getObraSocial())){
                System.out.println(p);
            }
        }

        //espaciado
        System.out.println("");
        //9.	Mostrar los médicos y la cantidad de consultas que atendieron.
        System.out.println(medico1.getConsultas());
        System.out.println(medico2.getConsultas());

        //espaciado
        System.out.println("");
        //10.obtener todos los pacientes junto con su historial clinica
        for(Paciente p : pacientes){
            System.out.println(p.getHistorialClinica());
        }
    }
}