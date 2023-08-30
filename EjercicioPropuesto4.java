
package ejerciciopropuesto4;

import java.util.Scanner;

public class EjercicioPropuesto4 {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); 
        int edad_Juan, edad_Alberto, edad_Ana, edad_mama; //Declaracion de variables (edad).
        System.out.println("Ingrese la edad de Juan: ");
        edad_Juan=entrada.nextInt(); //Se calcula edad de Juan
        edad_Alberto=(2*edad_Juan)/3; //Se calcula edad de Alberto
        edad_Ana=(4*edad_Juan)/3; //Se calcula edad de Ana
        edad_mama=edad_Juan+edad_Alberto+edad_Ana; //Se calcula edad de la mamá.
        //Salidas
        System.out.println("La edad de Juan es: "+edad_Juan);
        System.out.println("La edad de Alberto es: "+edad_Alberto);
        System.out.println("La edad de Ana es: "+edad_Ana);
        System.out.println("La edad de la mama de Juan es: "+edad_mama);
        
    }
    
}
