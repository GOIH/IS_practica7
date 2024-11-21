package Ejercicios;

public class Ejercicio6 {
    
        public static char dni(int dni){
        char resul = 'T';
        Integer r = dni%23;
        switch(r){
            case 0:
                resul = 'T';
                break;
            case 1:
                resul = 'R';
                break;
            case 2:
                resul = 'W';
                break;
            case 3:
                resul = 'A';
                break;
            case 4:
                resul = 'G';
                break;
            case 5:
                resul = 'M';
                break;
            case 6:
                resul = 'Y';
                break;
            case 7:
                resul = 'F';
                break;
            case 8:
                resul = 'P';
                break;
            case 9:
                resul = 'D';
                break;
            case 10:
                resul = 'X';
                break;
            case 11:
                resul = 'B';
                break;
            case 12:
                resul = 'N';
                break;
            case 13:
                resul = 'J';
                break;
            case 14:
                resul = 'Z';
                break;
            case 15:
                resul = 'S';
                break;
            case 16:
                resul = 'Q';
                break;
            case 17:
                resul = 'V';
                break;
            case 18:
                resul = 'H';
                break;
            case 19:
                resul = 'L';
                break;
            case 20:
                resul = 'C';
                break;          
            case 21:
                resul = 'K';
                break;          
            case 22:
                resul = 'E';
                break;
        }
        return resul;
    }


    public static void main(String[] args) {
        System.out.println(dni(72700123)); 
    }
    
}
