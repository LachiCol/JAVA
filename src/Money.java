import java.util.Scanner;

public class Money {

	static int A;
	static int B;
	static int C;
	static int D;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�. ��, õ �� ������ �Է��Ͻÿ�: ");
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

		System.out.println("50000���� " + A + "�� 10000���� " + B + "�� 5000���� " + C + "�� 1000�� " + D + "��");
	}
}
