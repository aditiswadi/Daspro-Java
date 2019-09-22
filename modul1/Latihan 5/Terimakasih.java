import java.util.Scanner;
public class Terimakasih {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nama Ayah : ");
		String ayah = sc.nextLine();
		System.out.print("Nama Ibu : ");
		String ibu = sc.nextLine();
		
		
		System.out.println("Terima kasih ayah "+ ayah + " dan bunda " + ibu);
	}
}