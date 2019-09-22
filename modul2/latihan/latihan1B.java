import java.util.Scanner;
public class latihan1B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Nilai : ");
		int nilai = sc.nextInt();
		
		if (nilai >=80 && nilai <=100)  {
			System.out.print("Nilai A");
		} else if (nilai >=70 && nilai <=79) {
			System.out.print("Nilai B");
		} else if (nilai >=60 && nilai <=69) {
			System.out.print("Nilai C");	
		} else if (nilai >=30 && nilai <=59) {
			System.out.print("Nilai D");
		} else if (nilai >=0 && nilai <=29) {
			System.out.print("Nilai E");
		} else {
			System.out.print("Nilai Salah");
		}
	}
}