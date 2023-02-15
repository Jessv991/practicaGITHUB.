
import java.util.Scanner;
public class SumaNumeros {
		
    public static void main(String[] args) {
        // creamos un objeto Scanner para leer de la consola
        Scanner sc = new Scanner(System.in);
        
        // leemos los números de la consola
        System.out.print("Introduce tres números separados por comas: ");
        String numerosString = sc.nextLine();
        
        // separamos los números por comas y los convertimos a enteros
        String[] numeros = numerosString.split(",");
        if (numeros.length != 3) {
            System.out.println("EROOR debes introducir tres números separados por comas.");
        }
        
        int num1 = Integer.parseInt(numeros[0].trim());
        int num2 = Integer.parseInt(numeros[1].trim());
        int num3 = Integer.parseInt(numeros[2].trim());
        
        // calculamos la suma
        int suma = num1 + num2 + num3;
        
        
        // comprobamos si la suma es par o impar
        if (suma % 2 == 0) {
            System.out.println(suma+" es par.");
        } else {
            System.out.println(suma+" es impar.");
        }
        
    }
}