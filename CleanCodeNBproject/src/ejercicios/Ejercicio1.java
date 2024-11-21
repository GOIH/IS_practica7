package Ejercicios; // Cambiado a minúsculas

public class Ejercicio1 {
    
    public static boolean linea(String s) { // Cambiado a minúsculas
        return s.startsWith("a") && s.endsWith("s"); // Simplificado
    }

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println(linea("HOLA"));
        System.out.println(linea("ADIOS"));
    }
    
}

