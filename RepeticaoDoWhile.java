package Familia51;

import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somaPar=0,somaImpar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("\nEntre com um n�mero: ");
			num = leia.nextInt();
			
			if (num<0)
			
				{System.out.println("\nNegativo");
				}
			else
				
			if(num%2==0)
				
			{
				somaPar+=num;
			}
			
			else
				
			{
				somaImpar+=num;
			}
			
	}
		while (num>=0);
		System.out.println("\nSomat�rio dos n�meros Pares: "+somaPar);
		System.out.println("\nSomat�rio dos n�meros �mpares: "+somaImpar);
	}
}
