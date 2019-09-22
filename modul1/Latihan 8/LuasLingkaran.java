import java.util.Scanner;
public class LuasLingkaran {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		float phi, r, jari;
		phi = (float) (3.14);
		System.out.print("Masukan Jari-jari : ");
		r = sc.nextInt();
		jari = r*r;
		System.out.print("Luas : " + phi*jari);
	}
}
		