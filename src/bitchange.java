import java.util.Scanner;

public class bitchange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�� ������ �Է��ϼ���. ");
		int a = input.nextInt();
		int b = input.nextInt();

		a = a ^ b;
		b = b ^ a;
		a = a ^ b;

		System.out.println("A= " + a + "  B= " + b);
		System.out.println("(a^=b):" + Integer.toBinaryString(a ^= b));
	}

}
