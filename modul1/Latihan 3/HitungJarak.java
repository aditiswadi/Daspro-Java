import java.util.Scanner;
public class HitungJarak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kecepatan : ");
			int s = sc.nextInt();
			System.out.print("Waktu : ");
			int t = sc.nextInt();
			int v = s*t;
			System.out.println("Kecepatan = "+ v );
	}
}