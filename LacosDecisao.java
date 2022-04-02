package Familia51;

import java.util.Scanner;

public class LacosDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nMenu de elogios!!!");
		System.out.println("\nEscolha qual será o seu elogio...");
		System.out.println("\nN1. Acolhedora");
		System.out.println("\nN2. Unida");
		System.out.println("\nN3. Inteligente");
		System.out.println("\nN4. Animada");
		System.out.println("\nPor favor digite sua opção: ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\nVocês são acolhedores");
			break;
			
		case 2:
			System.out.println("\nVocês são unidos");
			break;
		
		case 3:
			System.out.println("\nVocês são inteligentes");
			break;
			
		case 4:
			System.out.println("\nVocês são animados");
			break;
		default:
			System.out.println("\nAtenção!Você digitou uma opção inválida!");
		}
	}

}
