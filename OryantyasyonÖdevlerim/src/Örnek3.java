import java.util.Scanner;

public class Örnek3 {

	public static void main(String[] args) {
		
		int km;
		double kmbasi = 2.20 , toplamücret;
		Scanner input = new Scanner(System.in);
		System.out.println("Kilometreyi giriniz:");
		km = input.nextInt();
		toplamücret  = kmbasi * km;
		toplamücret = 10 + (kmbasi * km);
		toplamücret = (toplamücret < 20) ? 20 : toplamücret;
		System.out.println("Toplam Ücret :" + toplamücret);
		
	}

}
