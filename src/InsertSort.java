import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {

		int[] arr = new int[10];
		System.out.println("���� ���� �˰��� �Դϴ�.\n");

		System.out.println("[�������� 10���� ������ �������ϴ�.]");
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

		System.out.println("\n[���������� �������Դϴ�.]\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "]");
		}

		System.out.println("\n[�������� ��.]\n");
	}
}
