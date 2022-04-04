import java.util.Scanner;

public class Money {

	static int A;
	static int B;
	static int C;
	static int D;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("금액을 입력하시오. 단, 천 원 단위로 입력하시오: ");
		int money = input.nextInt();

		while (true) {
			if (money >= 50000) {
				money = money - 50000;
				A++;
				continue;
			}
			if (money >= 10000) {
				money = money - 10000;
				B++;
				continue;
			}
			if (money >= 5000) {
				money = money - 5000;
				C++;
				continue;
			}
			if (money >= 1000) {
				money = money - 1000;
				D++;
				continue;
			}
			if (money == 0) {
				break;
			}
		}

		System.out.println("50000원권 " + A + "개 10000원권 " + B + "개 5000원권 " + C + "개 1000원 " + D + "개");
	}
}
