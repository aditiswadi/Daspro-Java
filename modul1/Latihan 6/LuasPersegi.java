import java.util.Scanner;
public class LuasPersegi {
	public static void main (String[] args) {
		Scanner nilai = new Scanner (System.in);
		int panjang, tinggi;
		System.out.print("Masukan Panjang : ");
		panjang = nilai.nextInt();
		System.out.print("Masukan Tinggi : ");
		tinggi = nilai.nextInt();
		System.out.println("Luas : " + panjang*tinggi);
	}
}
		