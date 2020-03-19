
package contraseña2;
import java.util.Scanner;

/**
 *
 * @author Uriel Solano
 */
public class  Contraseña2 {

    public static void main (String[] args) {

     Scanner entrada= new Scanner(System.in);
        String contra="";
        System.out.println("Introduce la contraseña");
        contra=entrada.nextLine();
        String c="abc";
        if(contra.equals(c))
         System.out.print("correcta");
        else
         System.out.print("incorrecta");
   
    }
    
}
