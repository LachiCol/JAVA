import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� ������ �Է��ϼ���. ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b && a > c) {
			System.out.println("�ִ밪��: " + a);
		} else if (b > c && b > a) {
			System.out.println("�ִ밪��: " + b);
		} else {
			System.out.println("�ִ밪��: " + c);
		}
	}

}
