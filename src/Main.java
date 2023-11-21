import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Colors List!");
        System.out.println("¿cuántos colores quieres introducir?");
        int numColores =  input.nextInt();

        ArrayList<String> colores = new ArrayList<String>();

        for (int i  =  1;  i <= numColores;  i++){
            System.out.println("Introduce el color nº" + i + ":");
            String color = input.next();
            colores.add(color);
        }
        System.out.println("has introducido los siguientes colores:");

        for (int i = 0; i <colores.size(); i++){
            System.out.println("\t" + colores.get(i));
        }
            input.close();


       /* // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }*/
    }
}