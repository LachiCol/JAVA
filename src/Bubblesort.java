import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {

		int[] arr = new int[10];
		System.out.println("버블 정렬 알고리즘 입니다.\n");

		System.out.println("[랜덤으로 10개의 정수를 만들어냅니다.]");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 999) + 1;
			
			System.out.print("[" + arr[i] + "]");
		}
		boolean check = true;
		for (int n = 0; n < arr.length; n++) {
			check=false;
			for (int j = 0; j < arr.length - n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					check=true;
				}
			}
			System.out.println("\n[버블정렬이 진행중입니다.]\n");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("["+arr[i]+"]");
			}
		}System.out.println("\n[버블정렬 끝.]\n");
	}
	
}
