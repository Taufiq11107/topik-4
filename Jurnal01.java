package org.d3ifcool.ima04;
import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int angka;
		Scanner number = new Scanner(System.in);
	
		angka = number.nextInt(); 
		if (angka %6==0) {
		System.out.println ("Kelipatan enam");
		} else{
		System.out.println ("Bukan kelipatan enam");
		}
	}
}
