import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("세 정수를 입력하세요. ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b && a > c) {
			System.out.println("최대값은: " + a);
		} else if (b > c && b > a) {
			System.out.println("최대값은: " + b);
		} else {
			System.out.println("최대값은: " + c);
		}
	}

}
