import java.util.Scanner;
public class latihan1A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Nilai : ");
		int nilai = sc.nextInt();
		
		if (nilai % 2 == 0) {
			System.out.print("Bilangan Genap");
		} else { 
			System.out.print("Bilangan Ganjil");
		}
	}
}