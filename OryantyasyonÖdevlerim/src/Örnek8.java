import java.util.Scanner;

public class Örnek8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int Türkce , Matematik , Fizik , Kimya , Beden;
		System.out.println("Türkçe notunuzu giriniz:");
		Türkce = input.nextInt();
		System.out.println("Matematik notunuzu giriniz:");
		Matematik = input.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		Fizik = input.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		Kimya = input.nextInt();
		System.out.println("Beden eğitimi notunuzu giriniz:");
		Beden = input.nextInt();
		
		double toplam , ortalama;
        toplam = (Türkce+Matematik+Fizik+Kimya+Beden);
        ortalama =(toplam/5);
        
		if(ortalama>=50) {
			System.out.println("Dersi geçtiniz tebrikler" + ortalama);
		}else 
			System.out.println("Dersi geçemediniz daha çok çalışınız lütfen.Ortamanız :" + ortalama);

	}

}
