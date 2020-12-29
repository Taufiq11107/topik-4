package org.d3ifcool.ima04;
import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int dira, radi, idar, highest;
		
		Scanner skor = new Scanner(System.in);
		dira = skor.nextInt();
		radi = skor.nextInt();
		idar = skor.nextInt();
		highest = (dira>radi)?dira:radi;
		highest = (highest>idar)?highest:idar;
		
		if (dira>radi) {
			System.out.println ("Dira");
		} else if (highest>idar) {
		System.out.println ("Radi");
		} else {
			System.out.println ("Idar");
		}
	}
}
