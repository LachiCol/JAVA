import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		System.out.println("연도를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int Year = input.nextInt();
		int a;
		if (Year % 4 == 0) {
			if (Year % 100 == 0) {
				if (Year % 400 == 0) {
					a = 1;
				} else {
					a = 0;
				}

			} else {
				a = 1;
			}
		} else {
			a = 0;
		}

		if (a == 1) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}

	}

}
