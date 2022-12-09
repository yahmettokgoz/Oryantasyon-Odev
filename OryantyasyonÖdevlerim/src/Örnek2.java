import java.util.Scanner;

public class Örnek2 {

	public static void main(String[] args) {
		
		int havasıcaklıgı;
		 Scanner input = new Scanner(System.in);
		 System.out.println("Hava sıcaklığını giriniz:");
		 havasıcaklıgı = input.nextInt();
		  if(havasıcaklıgı >=30) {
			  System.out.println("Yüzmeye gidebilirsin");
		  }else if (havasıcaklıgı >=5 && havasıcaklıgı <=30) {
			  System.out.println("Sinemaya gidebilirsin");
		  }else {
			  System.out.println("Kayak yapmaya gidebilirsin");
		  }
		 
	}

}
