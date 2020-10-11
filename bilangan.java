package tugas;

import java.util.Scanner;

public class bilangan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Masukan Angka > ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.print(num+" adalah bilangan genap");
		}else {
			System.out.print(num+" adalah bilangan ganjil");
		}
	}

}
