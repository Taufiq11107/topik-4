package org.d3ifcool.ima04;
import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int telur;
		int HARGA_TELUR = 800;
		
		Scanner amount = new Scanner(System.in);
	
		telur = amount.nextInt(); 
		
		
		if (telur >= 24) {
			System.out.println("Telur "+telur+ " x " +HARGA_TELUR+ " = " +(telur*HARGA_TELUR)  );
			System.out.println("Diskon 15% = " +(telur*HARGA_TELUR*15/100));
			System.out.println("Total dibayar = "+(telur*HARGA_TELUR - ((telur*HARGA_TELUR*15/100))));
		} else if (telur >= 12){
			System.out.println("Telur "+telur+ " x " +HARGA_TELUR+ " = " +(telur*HARGA_TELUR)  );
			System.out.println("Diskon 10% = " +(telur*HARGA_TELUR*10/100));
			System.out.println("Total dibayar = "+(telur*HARGA_TELUR - ((telur*HARGA_TELUR*10/100))));
		} else if (telur <= 12){ 	
			System.out.println("Telur "+telur+ " x " +HARGA_TELUR+ " = " +(telur*HARGA_TELUR)  );
			System.out.println("Diskon 0% = " +(telur*HARGA_TELUR*0/100));
			System.out.println("Total dibayar = "+(telur*HARGA_TELUR - ((telur*HARGA_TELUR*0/100))));
		}
	}
}
