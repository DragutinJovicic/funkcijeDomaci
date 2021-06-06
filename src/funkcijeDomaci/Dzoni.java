package funkcijeDomaci;

import java.util.Scanner;

public class Dzoni {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Unesite 3 broja:");	
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		System.out.println("Najmanji broj je: " + najmanji(a,b,c));
	}
	
	public static int najmanji(int br1, int br2, int br3) {
		int najmanji;
		if(br1 < br2) {
			najmanji = br1;
		} else {
			najmanji = br2;
		}
		if(br3 < najmanji) {
			najmanji = br3;
		}
		
		return najmanji;
	}
	
	

}
