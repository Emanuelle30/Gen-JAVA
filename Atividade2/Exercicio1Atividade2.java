package Familia51;

import java.util.Scanner;

public class Exercicio1Atividade2 {
/* Minor middle bigger
	A	B	C
	A	C	B
	B	A	C
	B	C	A
	C	A	B
	C	B	A*/
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		A = leia.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		B = leia.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		C = leia.nextInt();
		
		if (A<=B && B<=C)
		{
			System.out.println("\nA ordem crescente �: "+A+" , "+B+" , "+C);
		}
		else if (A<=C && C<=B)
		{
			System.out.println("\nA ordem crescente �: "+A+" , "+C+" , "+B);
		}
		else if (B<=A && A<=C)
		{
			System.out.println("\nA ordem crescente �: "+B+" , "+A+" , "+C);
		}
		else if (B<=C && C<=A)
		{
			System.out.println("\nA ordem crescente �: "+B+" , "+C+" , "+A);
		}
		else if (C<=A && A<=B)
		{
			System.out.println("\nA ordem crescente �: "+C+" , "+A+" , "+B);
		}
		else 
		{
			System.out.println("\nA ordem crescente �: "+C+" , "+B+" , "+A);
		}
		
	}

}
