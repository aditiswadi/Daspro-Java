import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BMI {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int beratBadan;
		double tinggiBadan;
		double tinggiBadanM;
		double hasil;
		double beratBadanIdealMin;
		double beratBadanIdealMax;
		
	
		try {
			System.out.print("\nMasukan Berat Badan(Kg) \t: ");
			beratBadan = Integer.parseInt(br.readLine());
			System.out.print("Masukan Tinggi Badan(Cm) \t: ");
			tinggiBadan = Double.parseDouble(br.readLine());
			tinggiBadanM = tinggiBadan/100;
			System.out.println("\nBerat Badan Anda \t: " + beratBadan + " Kg");
			System.out.println("Tinggi Badan Anda \t: " + tinggiBadanM + " M\n");
			hasil = beratBadan/(tinggiBadanM*tinggiBadanM);
			System.out.printf("Hasil BMI Anda \t\t: %.1f \n",hasil);
			beratBadanIdealMin = 18.5*(tinggiBadanM*tinggiBadanM);
			beratBadanIdealMax = 24.9*(tinggiBadanM*tinggiBadanM);
			System.out.printf("Berat Badan Ideal Min  \t: %.1f \n",beratBadanIdealMin);
			System.out.printf("Berat Badan Ideal Max  \t: %.1f \n",beratBadanIdealMax);
			if (hasil < 18.5) {
				System.out.print("Kekurangan Berat badan");
			} else if (hasil >= 18.5 && hasil <= 24.9) {
				System.out.print("Tubuh Ideal");
			} else if (hasil >= 25.0 && hasil <= 29.9) {
				System.out.print("Kelebihan Berat Badan"); 
			} else if (hasil >= 30.0) {
				System.out.print("Kegemukan (Obesitas");
			}if (hasil < 18.5) {
				System.out.print("Kekurangan Berat badan");
			} else if (hasil >= 18.5 && hasil <= 24.9) {
				System.out.print("Tubuh Ideal");
			} else if (hasil >= 25.0 && hasil <= 29.9) {
				System.out.print("Kelebihan Berat Badan"); 
			} else if (hasil >= 30.0) {
				System.out.print("Kegemukan (Obesitas");
			}
			System.out.println("\n\nKeterangan BMI :");
			System.out.println("<18.5 \t\t= Kekurangan Berat Badan");
			System.out.println("\n18.5-24.9 \t= Normal(Ideal)");
			System.out.println("\n25.0-29.9 \t= Kelebihan Berat Badan");
			System.out.println("\n>30.0 \t\t= Kegemukan(Obesitas)");
			
		}catch(Exception e) {
			System.out.println("Inputan Salah!!!");
		}
	}
}