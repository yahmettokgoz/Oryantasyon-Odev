import java.util.Scanner;

public class Örnek7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen sayıyı giriniz:");
		int sayı = input.nextInt();
		
		for(int i=1; i<=sayı; i*=4) {
			System.out.println("4'ün kuvvetleri :" + i);
		}
		for(int i=1; i<=sayı; i*=5) {
			System.out.println("5'in kuvvetleri:" + i);
		}
		
	}

}
