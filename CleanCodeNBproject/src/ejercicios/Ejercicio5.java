package Ejercicios;

public class Ejercicio5 {
    
    private static String mes(int mes){
        String resul = "";
        if(mes == 1){
            resul = "es un mes 30 días";
        }
        else{
            if(mes == 2){
                resul = "es un mes de 29 o 30 días";
            }
            else{
                if(mes == 3){
                    resul = "es un mes 31 días";
                }
                else{
                    if(mes == 4){
                        resul = "es un mes de 30 días";
                    }
                    else{
                        if(mes == 5){
                            resul = "es un mes de 31 días";
                        }
                        else{
                            if(mes == 6){
                                resul = "es un mes de 30 días";
                            }
                            else{
                                if(mes == 7){
                                    resul = "es un mes de 31 días";
                                }
                                else{
                                    if(mes == 8){
                                        resul = "es un mes de 31 días";
                                    }
                                    else{
                                        if(mes == 9 ){
                                            resul = "es un mes de 30 días";
                                        }
                                        else{
                                            if(mes == 10){
                                                resul = "es un mes de 31 días";
                                            }
                                            else{
                                                if(mes == 11){
                                                    resul = "es un mes de 30 días";
                                                }
                                                else{
                                                    if(mes == 12){
                                                        resul = "es un mes de 31 días";
                                                    }
                                                    else{
                                                        resul = "es un mes incorrecto";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return resul;  
    }

    public static void main(String[] args) {
        System.out.println(mes(11));
    }
    
}
