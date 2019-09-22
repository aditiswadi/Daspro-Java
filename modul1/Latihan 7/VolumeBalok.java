import java.util.Scanner;
public class VolumeBalok {
	public static void main (String[] args) {
		Scanner nilai = new Scanner (System.in);
		int panjang, lebar, tinggi;
		System.out.print("Masukan Panjang : ");
		panjang = nilai.nextInt();
		System.out.print("Masukan Lebar : ");
		lebar = nilai.nextInt();
		System.out.print("Masukan Tinggi : ");
		tinggi = nilai.nextInt();
		System.out.print("Volume : " + panjang*lebar*tinggi);
	}
}
		