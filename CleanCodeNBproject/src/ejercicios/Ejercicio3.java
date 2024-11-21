package Ejercicios; // Cambiado a minúsculas

public class Ejercicio3 {

    private static String horaMinutoSegundo(int h, int m, int s) {
        String resul = "";
        if (h > 0 && h < 24) {
            if (m > 0 && m < 60) {
                if (s > 0 && s < 60) {
                    resul = "correcto";
                } else {
                    resul = "segundos incorrectos";
                }
            } else {
                resul = "minutos incorrectos";
            }
        } else {
            resul = "hora incorrecta";
        }
        return resul;
    }

    public static void main(String[] args) {
        System.out.println(horaMinutoSegundo(9, 34, 23));
        System.out.println(horaMinutoSegundo(25, 34, 23));
    }
    
}

