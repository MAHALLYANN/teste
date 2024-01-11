package verao;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
	      Only apenas = new Only();
	      
	      
	System.out.println("##INSIRA O NOME:##");
    apenas.Nome = sc.nextLine();
    System.out.println("##INSIRA NOTA 1:##");
    apenas.Nota1 = sc.nextDouble();
    System.out.println("##INSIRA NOTA 2:##");
    apenas.Nota2 = sc.nextDouble();
    
    System.out.println("Resultado =" +apenas.getResult());
    
			
			
	sc.close();
	}

}
