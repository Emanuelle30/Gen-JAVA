package Familia51;

import java.util.Scanner;

public class Atividade1Exercicio1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			float n1,n2,n3, maior = 0;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nPROGRAMA PARA DESCOBRIR O MAIOR VALOR");
			System.out.println("\nEntre com o primeiro valor: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com o segundo valor: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com o terceiro valor: ");
			n3 = leia.nextFloat();
			
			if (n1>n2 && n1>n3)
			{
				System.out.println("\nO maior valor é: "+n1);
			}
			else if (n2>n1 && n2>n3)
			{
				System.out.println("\nO maior valor é: "+n2);
			}
			else
			{
				System.out.println("\nO maior valor é: "+n3);
				System.out.println("\nFIM!");
			}
		
		}

	}