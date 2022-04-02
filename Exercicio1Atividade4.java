package Familia51;

import java.util.Scanner;

public class Exercicio1Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		double res;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPROGRAMA PAR ou ÍMPAR");
		System.out.println("\nEntre com o número: ");
		n = leia.nextInt();
		
		if (n % 2 == 0)
		{
			res = Math.sqrt(n);
		}
		else
		{
			res = Math.pow(n,2);
		}
		System.out.println("\nResultado: "+res);
		System.out.println("\nFIM!");
	}

}
