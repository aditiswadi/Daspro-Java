import java.util.Scanner;
public class SelamatDatang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nama : ");
		String Nama = sc.nextLine();
		System.out.print("NRP : ");
		String NRP = sc.next();
		System.out.print("Kelas : ");
		String Kelas = sc.next();
		System.out.print("IPK :");
		Float IPK = sc.nextFloat();
		System.out.println("\nNRP : " + NRP);
		System.out.println("Nama : " + Nama);
		System.out.println("Kelas : " + Kelas);
		System.out.println("IPK : " + IPK);
	}
}