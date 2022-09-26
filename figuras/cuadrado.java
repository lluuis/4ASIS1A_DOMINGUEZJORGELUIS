package figuras;

import java.util.Scanner;

public class cuadrado {
    Scanner teclado = new Scanner(System.in);
    int n;
    public void entradato (){
        System.out.println("ingrese el lado del cuadrado: ");
        n = teclado.nextInt();

    }
    public void proceso(){
        if(n >= 1 && n <= 200 ){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    System.out.print( "*");

                }
                System.out.println("");
            }
            
        }else{
            System.out.println("por favor ingrese un numero entre 1 y 20");
        }
    }
    public static void main (String[] args){
        cuadrado fc = new cuadrado();
        fc.entradato();
        fc.proceso();
    }
}
