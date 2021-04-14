
package tp5.CLASES;

import java.util.Arrays;

public class Arreglo {
      
public static void sumarLista(int [] numeros){
    int s=0;
    float p;
    for(int i=0;i<numeros.length;i++){
    s=numeros[i]+s;}
    p= (float) s/numeros.length;
    System.out.println("Dados los numeros: "+Arrays.toString(numeros)+", la suma es: "+s+", y el promedio: "+p+".");
}
public static void buscarMayor (int [][] numerosBi){
    System.out.print("Dado el siguiente arreglo: "+Arrays.deepToString(numerosBi));
    int mayor=numerosBi[0][0];
    for (int[] numerosBi1 : numerosBi) {
        for (int c = 0; c < numerosBi1.length; c++) {
            if (numerosBi1[c] > mayor) {
                mayor = numerosBi1[c];
            }
        }
    }
    System.out.println(", el numero mayor es: "+mayor+".");
}
public static void cuentaVocales(String string){
    System.out.print("La cantidad de vocales en la palabra: "+string);
    int c=0;
    for (int i=0;i<string.length();i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                c++;
            }
    }
    System.out.println(" es: "+c+".");
}
public static void cuentaCaracter(String string,char buscar){
    int c=0;
    System.out.print("La cantidad de veces que se repite: "+buscar+", en: "+string);
        for (int v = 0; v < string.length(); v++) {
            if (string.charAt(v) == buscar ) {
                c++;
            }
        }
    System.out.println(", es: "+c+".");
 }
}

