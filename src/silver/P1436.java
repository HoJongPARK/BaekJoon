package silver;
import java.util.*;
public class P1436 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num==1)
			System.out.println("666");
		else if(num==2)
			System.out.println("1666");
		else
			System.out.println(solve(num));
			
	}
	
	static int solve(int num) {
		int count=2;
		for(int i=2666;;i++) {
			if(isDevil(i))
				count++;
			if(count==num)
				return i;
		}
		
	}
	
	static boolean isDevil(int num) {
		String str=String.valueOf(num);
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)=='6')
				count++;
			else
				count=0;
			if(count==3)
				return true;
		}
		return false;
	}
}
