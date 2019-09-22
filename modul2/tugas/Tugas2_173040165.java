import java.util.Scanner;
public class Tugas2_173040165 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("masukan username : ");
		String username = sc.next();
		System.out.print("masukan password : ");
		String password = sc.next();
			
		if (username.equals("admin")&& password.equals("abcd1234")) {
			System.out.print("Selamat datang admin");
		} else {
			System.out.print("Maaf anda tidak dikenali");
		}
	}
}
		
		
		
		
		
		