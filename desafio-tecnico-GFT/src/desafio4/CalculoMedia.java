package desafio4;

import java.util.Scanner;

public class CalculoMedia {
	
	public static void main(String[] args) {
		double nota1,nota2,nota3,mediaAritmetica;
		float mediaPonderada ;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" Para rececer a sua média aritmética, por favor digite 2 notas entre 0 e 10: ");
		nota1 = entrada.nextDouble();
		
		System.out.println(" Por favor digite a segunda nota entre 0 e 10: ");
		nota2 = entrada.nextDouble();
		
		mediaAritmetica = (nota1 + nota2) / 2;
		
		System.out.println("Sua média artimética é: " + mediaAritmetica);
		
		System.out.println(" Para rececer a sua média ponderada, por favor digite 3 notas entre 0 e 10: ");
		nota1 = entrada.nextDouble();
		
		System.out.println(" Por favor digite a segunda nota entre 0 e 10: ");
		nota2 = entrada.nextDouble();
		
		System.out.println(" Por favor digite a segunda nota entre 0 e 10: ");
		nota3 = entrada.nextDouble();
		
		mediaPonderada = (float) ((nota1*2)+ (nota2*3) + (nota3*4)/9);
		
		System.out.println("A sua média Ponderada é: " + mediaPonderada);
		
	}

}

