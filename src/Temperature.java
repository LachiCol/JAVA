import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		System.out.println("���ڿ� �µ��� �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		double Char = input.next().charAt(0);
		double Temp = input.nextInt();

		if (Char == 'c' || Char == 'C') {
			System.out.printf("����: " + Temp + " ȭ��: " + (5.0 / 9.0) * (Temp - 32));
		} else if (Char == 'f' || Char == 'F') {
			System.out.printf("ȭ��: " + Temp + " ����: " + (9.0 / 5.0) * (Temp + 32));
		} else {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
	}

}
