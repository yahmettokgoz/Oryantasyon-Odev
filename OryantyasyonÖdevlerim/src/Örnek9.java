import java.util.Scanner;

public class Örnek9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Faktöriyeli hesapalancak sayıyı giriniz:");
		int giris;
		giris = input.nextInt();
		
		int sonuc=1;			
		for(int i=1; i<=giris; i++) {
			sonuc*=i;
		}
		System.out.println("Girilen sayının faktöriyeli:" + sonuc);
	}

}
