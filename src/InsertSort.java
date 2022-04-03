import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {

		int[] arr = new int[10];
		System.out.println("삽입 정렬 알고리즘 입니다.\n");

		System.out.println("[랜덤으로 10개의 정수를 만들어냅니다.]");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 999) + 1;

			System.out.print("[" + arr[i] + "]");
		}

		for (int n = 1; n < arr.length; n++) {
			int target = arr[n];

			int j = n - 1;

			while (j >= 0 && target < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = target;
		}

		System.out.println("\n[삽입정렬이 진행중입니다.]\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "]");
		}

		System.out.println("\n[삽입정렬 끝.]\n");
	}
}
