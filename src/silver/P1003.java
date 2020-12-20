package silver;
import java.io.*;
import java.util.*;
public class P1003 {
	static Fibo[] dp;
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb=new StringBuilder();
      int tNum=Integer.parseInt(br.readLine());
      while(tNum-->0) {
    	  int N=Integer.parseInt(br.readLine());
    	  dp=new Fibo[N+2];
    	  dp[0]=new Fibo(1,0);
    	  dp[1]=new Fibo(0,1);
    	  pibo(N);
    	  System.out.printf("%d %d\n", dp[N].zero,dp[N].one);
      }

   }
   
   static void pibo(int N) {
	   for(int i=2;i<=N;i++){
		   Fibo a=dp[i-2];
		   Fibo b=dp[i-1];
		   dp[i]=new Fibo(a.zero+b.zero,a.one+b.one);
	   }
   }
   static public class Fibo{
	   long zero;
	   long one;
	   public Fibo(long zero,long one) {
		   this.zero=zero;
		   this.one=one;
	   }
   }
}