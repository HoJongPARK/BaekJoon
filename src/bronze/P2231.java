package bronze;
import java.util.*;
public class P2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num==sum(i))
			{
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	
	static int sum(int num) {
		int digit=1;
		int div=10;
		int ret=num;
		while(num/div!=0) {
			digit++;
			div*=10;
		}
		for(int i=digit-1;i>=0;i--) {
			ret+=(int)num/(int)Math.pow(10, i);
			num%=(int)Math.pow(10, i);
		}
		return ret;
	}
}
