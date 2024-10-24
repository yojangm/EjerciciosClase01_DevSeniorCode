import java.util.Scanner;
/**
 * Scanner
 */
public class SolicitarPalabras {
public static void main(String[] args) {
    //var palabra = new Scanner (System.in);
   var palabra = new Scanner(System.in);
   
   System.out.print("Ingrese la palabra 1: ");
   var palabra1 = palabra.nextLine();

   System.out.print("Ingrese la palabra 2: ");
   var  palabra2 = palabra.nextLine();

   System.out.print("Ingrese la palabra 3: ");
   var palabra3 = palabra.nextLine();

   System.out.println(palabra1+" "+palabra2+" "+palabra3);

   palabra.close();
    
}  
}