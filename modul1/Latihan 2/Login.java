import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Username : ");
		String username = sc.nextLine();
		System.out.print("Masukan Password : ");
		String password = sc.next();
		System.out.println("Selamat Datang " + username + " dengan password " + password);
		
	}
}