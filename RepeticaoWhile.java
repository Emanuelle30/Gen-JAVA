package Familia51;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,contNumero=0;		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		numero = ler.nextInt();
		
		while(numero != -99)
		{
			contNumero++;
			System.out.println("\nEntre com um n�mero: ");
			numero = ler.nextInt();
		}
		
		System.out.println("\nQuantidade de n�meros digitados foi de: "+contNumero);
	}

}
