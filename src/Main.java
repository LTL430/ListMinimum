import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i= 0; i<size;i++) {
			list.add(sc.nextInt());
		}
		
		for (int i=0;i<size;i++) {
			int min= getAndRemoveMin(list);
			System.out.println(min);
		}
	}

	private static int getAndRemoveMin(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int idx = 0;
		
		// find the minimum number;
		for (int i=0;i<list.size();i++) {
			int val = list.get(i);
			if (val<min) {
				min = val;
				idx = i ;
			}
		}
		
		// remove the min number at index idx
		list.remove(idx);
		
		
		return min;
		
		
	}

}
