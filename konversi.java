import java.text.DecimalFormat;
import java.util.Scanner;



public class konversi {
	static Scanner sc = new Scanner(System.in);
	static double cel, far, rea;
	static DecimalFormat dec = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		System.out.println("==========>Jenis Suhu<===========");
		System.out.println("[1] Celsius");
		System.out.println("[2] Farenheit");
		System.out.println("[3] Reamur");
		System.out.println("================X================");
		System.out.print("Pilih jenis Suhu > ");
		int suhu = Integer.valueOf(sc.nextLine());
		
		switch(suhu) {
			case 1:
				celsius();
				break;
				
			case 2 :
				farenheit();
				break;
				
			case 3 :
				reamur();
				break;
				
			default:
				System.out.print("Inputan anda salah");
		}
		
	}
	static void celsius() {
		System.out.print("Masukan nilai Celsius   > ");
		cel = sc.nextInt();
		far = (cel * 9/5) + 32;
		System.out.println("Nilai Farenheit = "+dec.format(far));
		rea = cel * 4/5;
		System.out.println("Nilai Reamur    = "+dec.format(rea));
 }
	static void farenheit() {
		System.out.print("Masukan nilai Farenheit > ");
		far = sc.nextInt();
		cel = (far - 32) * 5/9;
		System.out.println("Nilai Celsius   = "+dec.format(cel));
		rea = (far - 32) * 4/9;
		System.out.println("Nilai Reamur    = "+dec.format(rea));
}
	static void reamur() {
		System.out.print("Masukan nilai Raemur   > ");
		rea = sc.nextInt();
		cel = rea * 5/4;
		System.out.println("Nilai Celsius   = "+dec.format(cel));
		far = (rea * 32) + 9/4;
		System.out.println("Nilai Farenheit = "+dec.format(far));
	}
}


