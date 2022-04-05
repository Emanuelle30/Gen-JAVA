package Familia51;

import java.util.Scanner;

public class Exercicio1Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPROGRAMA PARA VERIFICAR CATEGORIAS");
		System.out.println("\nEntre com a idade: ");
		id = leia.nextInt();
		
		if (id>=10 && id<=14)
		{
			System.out.println("\nVocê se encontra na categoria infantil! ");
		}
		else if (id>=15 && id<=17)
		{
			System.out.println("\nVocê se encontra na categoria juvenil! ");
		}
		else if (id>=18 && id<=25)
		{
			System.out.println("\nVocê se encontra na categoria adulto! ");
		}
		
		else 
		{
			System.out.println("\nVocê não se encontra em nenhuma categoria!");
		}
		
			System.out.println("\nFIM! ");
	}

}
