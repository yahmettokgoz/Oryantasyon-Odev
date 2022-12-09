import java.util.Scanner;

public class Örnek10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz:");
		 double sayı = input.nextDouble();
		 
		 if(sayı<0.0) {
			 System.out.println(sayı + "Sayı negatiftir");
		 }else if(sayı>0.0) {
			 System.out.println(sayı + "Sayı pozitiftir");
		 }else
			 System.out.println(sayı + "Sayı sıfıra eşittir.");
	}

}
