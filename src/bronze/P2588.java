package bronze;
import java.util.*;
public class P2588 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b;
		
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}
