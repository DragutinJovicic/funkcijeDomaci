package funkcijeDomaci;

import java.util.Scanner;

public class Funkcije1OPET {

	public static void main(String[] args) {
		/*/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci
		 * da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu)
		 * najmanji od ta tri unesena broja.
		 */
		
		int a = najmanjiBroj();
		System.out.println(a);
	}

	public static int najmanjiBroj() {
		int unos;
		int pobednik = 0;
		for(int i = 1; i <= 3; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			Scanner sc = new Scanner(System.in);
			unos = sc.nextInt();
			if(i == 1) {
			pobednik = unos;
			}
			if(unos < pobednik) {
				pobednik = unos;
			}
		}
		return pobednik;
	}
}
