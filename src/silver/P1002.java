package silver;
import java.util.*;
import java.io.*;
public class P1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tNum=Integer.parseInt(br.readLine());
		
		while(tNum-->0) {
			String[] temp=br.readLine().split(" ");
			int[] x=new int[2];
			int[] y=new int[2];
			int[] r=new int[2];
			for(int i=0;i<2;i++) {
				x[i]=Integer.parseInt(temp[i*3]);
				y[i]=Integer.parseInt(temp[i*3+1]);
				r[i]=Integer.parseInt(temp[i*3+2]);
			}
			System.out.println(isMeet(x,y,r));
		}
		

	}
	static int isMeet(int[] x,int[] y,int[] r) {
		int distance=sqr(x[1]-x[0])+sqr(y[1]-y[0]);
		int R=sqr(r[0]+r[1]);
		int sub=sqr(r[0]-r[1]);
		if(distance<R&&distance>sub)
			return 2;
		else if(distance==R||(distance==sub&&distance!=0))
			return 1;
		else if(distance<sub||distance>R)
			return 0;
		else if(distance==0)
			if(r[0]==r[1])
				return -1;
			else
				return 0;
		return 0;
	}
	static int sqr(int a) {
		return a*a;
	}

}
