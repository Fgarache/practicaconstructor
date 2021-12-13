import java.util.Scanner;

public class Constructor {
    String nombre2= "";

    public Constructor (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("cual es tu nombre");
        nombre2 = entrada.nextLine();
        System.out.println("Tu nombre es: "+nombre2);
    }


}
