import java.util.Scanner;

public class KgtoPound {

	public static void main(String[] args) {
		System.out.println("����(kg)�� �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		double kg = input.nextInt();

		double pound = 0.453592 * kg;

		System.out.println("�Ŀ��(pound)�� ��ȯ�� ����: " + (String.format("%.3f", pound)));

	}

}
