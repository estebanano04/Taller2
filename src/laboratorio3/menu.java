package laboratorio3;

import java.util.Scanner;

public class menu {
public Scanner intro=new Scanner (System.in);
public void escogerMenu(){
    int opcion=0;
    System.out.println("\t  **********************MENU**********************");
    System.out.println("\n\t1. CONVERSOR DE CODIGO NUMERICOS Y SISTEMAS DE UNIDADES.");
    System.out.println("\n\t2. CALCULADORA MATRICIAL.");
    System.out.println("\n\t3. CALCULO DE VALORES EN RESISTENCIAS.");
    System.out.println("\n\t4. SALIR.");
    do {
        System.out.print("\tESCOJA UNA OPCION: ");
    opcion=intro.nextInt();
    switch  (opcion){
        case 1: conversionUnidades();
            break;
        case 2: calculadorMatriz();
            break;
        case 3: valorResistencia();
            break;
        case 4:
            break;
    }
    } while (opcion!=4);
    
    
    
}
public void conversionUnidades(){
System.out.println("\n\n\t-----------------------------------------------\n\tCONVERSOR DE CODIGO NUMERICOS Y SISTEMAS DE UNIDADES.");   
    System.out.println("\tDIGITE SU NUMERO:");
    int numero;
    numero=intro.nextInt();
    String binario=Integer.toBinaryString(numero);
    String hexa=Integer.toHexString(numero);
    String Octa=Integer.toOctalString(numero);
    System.out.println("\tBinario: "+binario+"\n\tHexadecimal: "+hexa+"\n\tOctal: "+Octa);
}
public void calculadorMatriz(){
    System.out.println("456454");

}
public void valorResistencia(){

    System.out.println("jijiji");
}
}
