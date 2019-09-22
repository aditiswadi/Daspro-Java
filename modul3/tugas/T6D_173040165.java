import java.util.Scanner;
public class T6D_173040165 {
	public static void main(String args[]) {
		int umur;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Umur : ");
		umur = sc.nextInt();
		if (umur >=4 && umur <=6) {
			if (umur >= 4 && umur <=5) {
				System.out.print("kelas A");
			
			} else if (umur <=6) {
				System.out.print("Kelas B");
			}
		} else {
			System.out.print("tidak diterima");
		}
	}
}