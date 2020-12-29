package org.d3ifcool.ima04;
import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		long penghasilan;
		
		Scanner wage = new Scanner(System.in);
	
		penghasilan = wage.nextInt(); 
		
		if (penghasilan >= 501) {
			System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah" );
			System.out.println("Pajak 30% = Rp. " +((penghasilan*1000000)*30/100));
			System.out.println("Penghasilan bersih = Rp. "+((penghasilan*1000000) - (((penghasilan*1000000*30/100)))));
		}else if (penghasilan >= 251) { 
			System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah" );
			System.out.println("Pajak 25% = Rp. " +((penghasilan*1000000)*25/100));
			System.out.println("Penghasilan bersih = Rp. "+((penghasilan*1000000) - (((penghasilan*1000000)*25/100))));
		}else if (penghasilan >= 51) { 	
			System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah" );
			System.out.println("Pajak 15% = Rp. " +((penghasilan*1000000)*15/100));
			System.out.println("Penghasilan bersih = Rp. "+((penghasilan*1000000) - (((penghasilan*1000000)*15/100))));
		}else if (penghasilan <=50)	{
			System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah" );
			System.out.println("Pajak 5% = Rp. " +((penghasilan*1000000)*5/100));
			System.out.println("Penghasilan bersih = Rp. "+((penghasilan*1000000) - (((penghasilan*1000000)*5/100))));
		}
	}
}