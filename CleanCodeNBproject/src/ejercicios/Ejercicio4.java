package Ejercicios;

public class Ejercicio4 {
    
    public static String dia(int d){
        String resul = "";
        if(d<=0){
            resul = "dia incorrecto";
        }
        else {
            if(d==1){
                resul = "lunes";
            } 
            else{
                if(d==2){
                    resul = "martes";
                } 
                else{
                    if(d==3){
                        resul = "miercoles";
                    } 
                    else{
                        if(d==4){
                            resul = "jueves";
                        } 
                        else{
                            if(d==5){
                                resul = "viernes";
                            } 
                            else{
                                if(d==6){
                                    resul = "sabado";
                                } 
                                else{
                                    if(d==7){
                                        resul = "domingo";
                                    }
                                    else{
                                        resul = "dia incorrecto";
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
        System.out.println(dia(3));
    }
    
}
