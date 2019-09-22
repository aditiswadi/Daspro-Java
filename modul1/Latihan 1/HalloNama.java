import java.util.Scanner;
public class HalloNama {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan nama anda : ");
		 	String nama = sc.next();
			System.out.println("Hallo " + nama);
	}
}