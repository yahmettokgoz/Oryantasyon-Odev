import java.util.Scanner;

public class Örnek6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String userName , Password;
		System.out.println("Lütfen kullanıcı adınızı giriniz:");
		userName = input.nextLine();
		System.out.println("Lütfen şifrenizi giriniz:");
		Password = input.nextLine();
		 
		  if(userName.equals("yusufahmettokgoz") && Password.equals("123456789")) {
			  System.out.println("Tebrikler, sisteme giriş yaptınız!");
		  }else {
			  System.out.println("Giriş bilgileriniz hatalı, lütfen tekrar deneyiniz");
		  }
		
	}

}
