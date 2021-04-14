
package tp5.MAIN;

import java.util.Scanner;
import tp5.CLASES.Arreglo;

public class PruebaArreglo {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);  
       int [] enteros1 = {3,6,7,1,9,12,54};
       int [][] enteros2 = {{2,4,5,2},{42,0,8},{2,100}};
        
       Arreglo.sumarLista(enteros1);
       Arreglo.buscarMayor(enteros2);
       System.out.println("Introducir palabra.");
       String buscarP = sc.nextLine();
       Arreglo.cuentaVocales(buscarP);
       System.out.println("Introducir palabra.");
       String buscarP2 = sc.nextLine();
       System.out.println("Introducir letra a buscar.");
       char buscar = sc.next().charAt(0);
       Arreglo.cuentaCaracter(buscarP2,buscar);
    }
    
}
