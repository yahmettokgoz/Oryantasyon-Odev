import java.util.Scanner;

public class Örnek4 {
	
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		int number1, number2 , choose;
		System.out.print("1.sayıyı girininiz: ");
		number1 = input.nextInt();
		System.out.print("2.Sayıyı giriniz: ");
		number2= input.nextInt();
		System.out.println("Yapmak istediğiniz işlemi giriniz: ");
		System.out.println("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
		System.out.println("Seçiminiz :");
		choose = input.nextInt();
		if (choose==1) {
			System.out.println("Toplama:" + (number1+number2));
		}else if(choose==2) {
			System.out.println("Çıkarma:" + (number1-number2));
		}else if(choose==3) {
			System.out.println("Çarpma:" + (number1*number2));
		}else if(choose==4) {
			if(number2==0) {
				System.out.println("İkinci sayı 0'a eşittir ve sonuç belirsizdir:");
			}else {
					System.out.println("Bölme: " + (number1/number2));
				}
		}else {
				System.out.println("Geçersiz bir işlem başlattınız tekrar deneyiniz");
							
			}
		}	
	}
