import java.util.Scanner;

public class Örnek5 {

	public static void main(String[] args) {
	
		// a>b>c veya a>c>b
	    // b>a>c veya b>c>a
		// c>a>b veya c>a>b
		
		Scanner input = new Scanner(System.in);
		
		int a , b , c;
		System.out.println("a sayısını giriniz:");
		a = input.nextInt();
		System.out.println("b sayısını giriniz:");
		b = input.nextInt();
		System.out.println("c sayısını giriniz:");
		c = input.nextInt();
		
		if(a>b && a>c) {
			if(b>c) {
			System.out.println("a>b>c");	
		}else{
			System.out.println("a>c>b");
		}
		 }else if(b>a && b>c) {
			 if(a>c) { 
				 System.out.println("b>a>c");
			 }else {
				 System.out.println("b>c>a");
			 }
			 }else {
				 if(a>b) {
					 System.out.println("c>a>b");
				 }else {
					 System.out.println("c>b>a");
				 }
			 }
		
		
	}

}
