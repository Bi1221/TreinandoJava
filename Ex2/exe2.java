package Ex2;

import java.util.Locale;
import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x ;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: "+ x);
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
		
		sc.close();
		
	
		
	}

}
