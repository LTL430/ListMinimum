import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] list = new int[size];
		
		int realSize = size;
		for (int i= 0; i<size;i++) {
			list[i] = sc.nextInt();
		}
		
		for (int i=0;i<size;i++) {
			int min= getAndRemoveMin(list, realSize);
			System.out.println(min);
			realSize--;
		}
	}

	private static int getAndRemoveMin(int[] list, int realSize) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		int idx = -1;
		
		// find the minimum number;
		for (int i=0;i<realSize;i++) {
			if (list[i]<min) {
				min = list[i];
				idx = i;
			}
		}
		
		// remove the min number at index idx
		// copy the member after idx to previous location;
		for (int i=idx+1;i<realSize;i++) {
			list[i-1] = list[i];
		}
		
		return min;
		
		
	}

}
