package silver5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class P18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<Integer> tempArr=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N=Integer.parseInt(br.readLine());
		String[] temp=br.readLine().split(" ");
		for(int i=0;i<N;i++) {
			arr.add(Integer.parseInt(temp[i]));
			tempArr.add(Integer.parseInt(temp[i]));
		}
		Collections.sort(tempArr);
		int value=0;
		for(int i=0;i<N;i++) {
			if(!map.containsKey(tempArr.get(i))) {
				map.put(tempArr.get(i), value++);
			}
		}
		for(int i=0;i<N;i++)
			sb.append(map.get(arr.get(i))+" ");
		System.out.print(sb);
	}

}
