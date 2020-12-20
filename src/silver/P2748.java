package silver;
import java.util.*;
public class P2748 {
	static long[] arr=new long[91];
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		arr[0]=0;
		arr[1]=1;
		pivo(num);
		System.out.println(arr[num]);
	}
	
	static void pivo(int n) {
		for(int i=2;i<=n;i++)
			arr[i]=arr[i-2]+arr[i-1];
	}
	
}
