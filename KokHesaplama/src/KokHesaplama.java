
//ikinci dereceden denklemin köklerini bulma
import java.util.Scanner;

public class KokHesaplama {
	public static void main(String[] args) {
		//ax2+bx+c=0
		int a,b,c;
		System.out.println("x2 nin katsayısını girin:");
		Scanner input= new Scanner(System.in);
		a=input.nextInt();
		
		System.out.println("x in katsayısını girin:");
		Scanner input2= new Scanner(System.in);
		b=input2.nextInt();
		
		System.out.println("sabit sayinin katsayısını girin:"); 
		Scanner input3= new Scanner(System.in);
		c=input3.nextInt();
		
		final double delta= b*b-4*a*c;
		
		double birinciKok= (-1*b-Math.abs(delta))/ (2*a);
		double ikinciKok= (-1*b+Math.abs(delta))/ (2*a);
		
		System.out.println(a+"x2+"+b+"x+"+c+" ikinci dereceden denklemin kökleri: "+ "x1= "+ birinciKok + " x2= "+ ikinciKok  );

		
		
		
		
		
	}
	

}
