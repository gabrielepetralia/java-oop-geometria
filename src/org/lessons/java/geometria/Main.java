package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int lng = 3;
		
		Rettangolo[] rett = new Rettangolo[lng];
		
		for(int i=0; i<lng; i++) {
			System.out.println("RETTANGOLO " + (i + 1));
			
			System.out.print("\nInserisci la base: ");
			int base = sc.nextInt();
			
			System.out.print("Inserisci l'altezza: ");
			int altezza = sc.nextInt();	
			
			rett[i] = new Rettangolo(base, altezza);
			
			rett[i].perimetro = rett[i].calcolaPerimetro();
			rett[i].area = rett[i].calcolaArea();
			
			System.out.println("\nBase: " + rett[i].base);
			System.out.println("Altezza: " + rett[i].altezza);
			System.out.println("\nPerimetro: " + rett[i].perimetro);
			System.out.println("Area: " + rett[i].area);
			
			rett[i].disegna();
			
			if(i<lng - 1) System.out.println("==============================\n");
		}
		
		sc.close();
	}
}
