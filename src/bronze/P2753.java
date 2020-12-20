package bronze;
import java.util.*;
public class P2753 {

	public static void main(String[] args) {
		int year;
		Scanner scan=new Scanner(System.in);
		
		year=scan.nextInt();
		
		if((year%4==0&&year%100!=0)||year%400==0)
			System.out.println(1);
		else
			System.out.println(0);

	}

}
