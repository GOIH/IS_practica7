package Ejercicios;

import java.time.LocalDate;

public class Ejercicio7 {

    public static void procesar(String[] pacientes) {
        for (String paciente : pacientes) {
            String[] datos = paciente.split(",");
            String nombre = datos[0];
            float peso = Float.parseFloat(datos[1]);
            float altura = Float.parseFloat(datos[2]);
            int añoNacimiento = Integer.parseInt(datos[3]);

            float imc = peso / (altura * altura);

            if (imc >= 25.00f) {
                int edad = LocalDate.now().getYear() - añoNacimiento;

                if (edad > 65) {
                    System.out.println(nombre + " tiene riesgo cardiovascular");
                }
            }
        }
    }

    public static void main(String[] args) {
        procesar(new String[]{
            "paciente1,80.2,1.84,2001",
            "paciente2,90.2,1.75,1940",
            "paciente3,89.2,1.75,2001"
        });
    }

}
