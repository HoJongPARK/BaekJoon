package silver;
import java.util.*;
public class P2503 {
	static int[] arr=new int[1000];
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		int count=0;
		num=scan.nextInt();
		Arrays.fill(arr, 0);
		for(int i=0;i<num;i++) {
			int temp=scan.nextInt();
			int strike=scan.nextInt();
			int ball=scan.nextInt();
			remove(temp,strike,ball);
		}
		for(int i=123;i<1000;i++)
			if(arr[i]==1)
				count++;
		System.out.println(count);
	}
	static void remove(int number,int strike,int ball) {
		int d1=1,d2=2,d3=3;
		
		int[] d=new int[4];
		int[] n=new int[4];
		int tempst=0;
		int tempbll=0;
		n[1]=number/100;
		number%=100;
		n[2]=number/10;
		number%=10;
		n[3]=number;
		while(d1*100+d2*10+d3<1000) {
			d[1]=d1;d[2]=d2;d[3]=d3;
			if(d1!=d2&&d2!=d3&&d3!=d1) {
			for(int i=1;i<4;i++)
				for(int j=1;j<4;j++) {
					if(d[i]==n[j])
						if(i==j)
							tempst++;
						else
							tempbll++;
				}
			if(tempst!=strike||tempbll!=ball) {
				arr[d1*100+d2*10+d3]=-1;
			}
			else
				if(arr[d1*100+d2*10+d3]==0)
					arr[d1*100+d2*10+d3]=1;
			
			}
			d3++;
			if(d3==10) {
				d3=1;
				d2++;
			}
			if(d2==10) {
				d2=1;
				d1++;
			}
			tempst=0;tempbll=0;
		}
	}
	
}
