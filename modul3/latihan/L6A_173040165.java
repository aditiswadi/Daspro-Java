import java.util.Scanner;

public class L6A_173040165 {
	public static void main(String args[]) {
		String Grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Grade : ");
		Grade = sc.next();
		if (Grade.equals("A") || Grade.equals("B")) {
			System.out.print("Anda Lulus");
		} else if (Grade.equals("C")) {
			System.out.print("Anda dapat mengulang atau tidak");
		} else if (Grade.equals("D") || Grade.equals("E")) {
			System.out.print("Anda harus mengulang");
		} else {
			System.out.print("Inputan Salah");
		}
	}
}