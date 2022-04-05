package Familia51;

import java.util.Scanner;

public class Atividade1Exercicio2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int IdadeAtual,MesNasc,DiaNasc,IdadeAnos,IdadeMes,IdadeDias;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("PROGRAMA QUE INFORMA IDADE EM DIAS");
			System.out.println("\nInforme sua idade: ");
			IdadeAtual = leia.nextInt();
			System.out.println("\nInforme seu mês de nascimento: ");
			MesNasc = leia.nextInt();
			System.out.println("\nInforme seu dia de nascimento: ");
			DiaNasc = leia.nextInt();
			
			IdadeAnos = (IdadeAtual*365);
			IdadeMes = (MesNasc*30);
			
			IdadeDias = (IdadeAnos+IdadeMes+DiaNasc);
			
			System.out.println("\nSua idade em dias é: "+IdadeDias);
			System.out.println("FIM!!!");
		}

	}
