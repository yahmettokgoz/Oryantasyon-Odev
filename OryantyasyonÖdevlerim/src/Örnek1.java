import java.util.Scanner;

public class Örnek1 {

	public static void main(String[] args) {
		
		int r;
		double alan , hacim , pi_sayisi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz: ");
		r = input.nextInt();
		alan = 2 * pi_sayisi * r;
		hacim = pi_sayisi * r * r;
		System.out.println("Dairenin alanı :" + alan);
		System.out.println("Dairenin hacmi :" + hacim);	

	}

}
