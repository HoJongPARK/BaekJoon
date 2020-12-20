package silver;
import java.io.*;
public class P2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		String temp1=br.readLine();
		String temp=temp1+"   ";
		for(int i=0;i<temp.length()-3;i++)
		{
			if(temp.charAt(i)=='c')
			{
				if(temp.charAt(i+1)=='='||temp.charAt(i+1)=='-')
				{
					i++;
					count++;
				}
				else
					count++;
			}
			else if(temp.charAt(i)=='d')
			{
				if(temp.charAt(i+1)=='-') {
					count++;
					i++;
				}
				else if(temp.charAt(i+1)=='z') {
					if(temp.charAt(i+2)=='=')
					{
						count++;
						i+=2;
					}
					else
						count++;
				}
				else
					count++;
				
			}
			else if(temp.charAt(i)=='l')
			{
				if(temp.charAt(i+1)=='j')
				{
					count++;
					i++;
				}
				else
					count++;
			}
			else if(temp.charAt(i)=='n')
			{
				if(temp.charAt(i+1)=='j')
				{
					count++;
					i++;
				}
				else
					count++;
			}
			else if(temp.charAt(i)=='s')
			{
				if(temp.charAt(i+1)=='=')
				{
					count++;
					i++;
				}
				else
					count++;
			}
			else if(temp.charAt(i)=='z')
			{
				if(temp.charAt(i+1)=='=')
				{
					count++;
					i++;
				}
				else
					count++;
			}
			else
				count++;
		}
		System.out.println(count);
	}
	
}
