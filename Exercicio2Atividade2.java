package Familia51;

import java.util.Scanner;

public class Exercicio2Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int IdadeAnos,IdadeMes,IdadeDias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("PROGRAMA QUE INFORMA IDADE COMPLETA");
		System.out.println("\nInforme sua idade em dias: ");
		IdadeDias = leia.nextInt();
		
		IdadeAnos = (IdadeDias/365);
		IdadeMes = ((IdadeDias&365)/30);
		IdadeDias = ((IdadeDias&365)%30);
		
		System.out.println("\nIdade em anos: "+IdadeAnos);
		System.out.println("\nIdade em meses: "+IdadeMes);
		System.out.println("\nIdade em dias: "+IdadeDias);
		System.out.println("FIM!!!");
	}

}
