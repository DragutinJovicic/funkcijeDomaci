package funkcijeDomaci;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj
		 * program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		 */
		int rezultat;
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite 3 broja: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		rezultat = izracunajProizvod(a, b, c);
		System.out.println(rezultat);
		
		
	}
	 

	public static int izracunajProizvod(int pera1, int pera2, int pera3) {
		//int proizvod = pera1 * pera2 * pera3;
		//return proizvod;
		
		return pera1 * pera2 * pera3;
	}
	
}
