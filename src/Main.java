import java.util.ArrayList;
import java.util.Collections;
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
		
		
			// sort list
			
		Collections.sort(list);
		
		// print list
		
		for (int val:list) {
			System.out.println(val);
		}
		
	}

	

}
