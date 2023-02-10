import java.util.Scanner;

public class FraseText {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in
				);
		
		int cont=0;
		
		System.out.println("Escribe una frase");
		String frases=entrada.next();
		
		System.out.println("Escribe un caracter");
		String caracter=entrada.next();
		
		
		
		if (caracter.length()>1) { 
			
			System.out.println("ERROR (sólo debe ser un caracter)");
		}
		
		for (int i = 0; i <frases.length(); i ++) { 
			
			
			
				if (frases.charAt (i) == caracter.charAt(0))
				{
					cont++;
				}
		}
		
		
		if (cont==0) 
		{
			System.out.println("ERROR (caracter no exite)");
			
		}else{
			
			frases=frases.replaceAll(caracter, "*");
			System.out.println(frases);
		}
		

	}

}
