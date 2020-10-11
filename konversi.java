package tugas;

import java.text.DecimalFormat;
import java.util.Scanner;


public class konversi {
    static Scanner scan = new Scanner(System.in);
	static double cel,far,rea;
	static DecimalFormat dec = new DecimalFormat("#.##");
		
	public static void main(String[] args) { 	 
		System.out.println("=======Pilih Jenis Suhu========");
   	    System.out.println("[1] Celsius");
	    System.out.println("[2] Farenheit");
	    System.out.println("[3] Reamur");
	    System.out.println("[4] Exit");
	    System.out.print("Pilih jenis suhu => ");
	    int suhu = Integer.valueOf(scan.nextLine());

			switch(suhu){
				case 1 :
					celsius();
					break;
				case 2 :
					farenheit();
					break;
				case 3 :
					reamur();
					break;
				case 4 :
					System.exit(0);
				default :
					System.out.println("Pilihan anda salah");
					
			}
		}
		
		static void celsius() {
			 System.out.print("Masukan nilai Celsius > ");
			 cel = scan.nextInt();
			 far = (cel * 9/5) + 32;
			 System.out.println("Farenheit = "+far);
			 rea = cel * 4/5;
			 System.out.println("Reamur = "+rea);
		}
		
		static void farenheit() {
	         System.out.print("Masukan nilai Farenheit > ");
	         far = scan.nextInt();
			 cel = (far - 32) * 5/9 ;
			 System.out.println("Celsius = "+dec.format(cel));
			 rea = (far - 32) * 4/9  ;
			 System.out.println("Reamur = "+dec.format(rea));
		}
		
		static void reamur() {
			 System.out.print("Masukan nilai suhu > ");
			 rea = scan.nextInt();
			 cel = rea * 5/4;
			 System.out.println("Celsius = "+dec.format(cel));
			 far = (rea * 9/4) + 32;
			 System.out.println("farenheit = "+dec.format(far));
			 
	    }
	}