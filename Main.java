
package pkg3contraseñas;

import java.util.Scanner;

/**
 *
 * @author Uriel Solano
 */
public class Main {

    public static void main(String[] args) {
    
    Scanner entrada= new Scanner(System.in);
        for(int i=1;i<=3;i++){
        String contra="";
        System.out.println("Introduce la contraseña: ");
        contra=entrada.nextLine();
        String c="abc";
      
        if(contra.equals(c)){
        System.out.print("correcta ");
        break;
        }else{
        System.out.print("incorrecta ");
        }
        }
    }
}
