import java.util.Scanner;
public class L6C_173040165 {
	public static void main(String[] args) {
		int bilangan;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Angka : ");
		bilangan = sc.nextInt();
		if(bilangan >= 1 && bilangan <= 100) {
			if (bilangan %2 == 0) {
				System.out.print(bilangan + " Genap");
			} else if (bilangan % 2 == 1) {
				System.out.print(bilangan + " ganjil");
			}
		} else {
				System.out.print(bilangan + " salah");
		}
	}
}