package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class P7662 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			TreeSet<Integer> tree=new TreeSet<>(new Comp()) ;
			int K=Integer.parseInt(br.readLine());
			while(K-->0) {
				String[] oper=br.readLine().split(" ");
				if(oper[0].charAt(0)=='I')
					tree.add(Integer.parseInt(oper[1]));
				else
					if(oper[1].charAt(0)=='-')
					{
						if(!tree.isEmpty())
							tree.pollFirst();
					}
					else
					{
						if(!tree.isEmpty())
							tree.pollLast();
					}
			}
			if(tree.isEmpty())
				System.out.println("EMPTY");
			else
				System.out.printf("%d %d\n",tree.last(),tree.first());
		}
	}
	static class Comp implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1>o2)
				return 1;
			else 
				return -1;
		}
	}
}
