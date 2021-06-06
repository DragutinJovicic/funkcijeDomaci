package funkcijeDomaci;

import java.util.Scanner;

public class DodatniFunkcije3 {

	public static void main(String[] args) {
		/*
		 * Napisati program
		 * koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve
		 * metode. Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih
		 * brojeva.
		 */
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite 3 broja:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println("Zbir brojeva je: " + saberiBrojeve(a, b, c) );
		System.out.println("Najveci broj je: " + vratiNajveci(a, b, c));
		
	}
	public static int saberiBrojeve(int no1, int no2, int no3) {
		return no1 + no2 + no3;
	}
	public static int vratiNajveci(int no1, int no2, int no3) {
		int najveci;
		if(no1 > no2) {
			najveci = no1;
		} else {
			najveci = no2;
		}
		if(no3 > najveci) {
			najveci = no3;
		}
		return najveci;
	}
}
