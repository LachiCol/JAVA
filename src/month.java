import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		System.out.println("���� �Է��Ͻÿ�.");
		Scanner input = new Scanner(System.in);
		double Month = input.nextInt();

		if (Month >= 1 && Month <= 6) {
			System.out.println("��ݱ� �Դϴ�");
		} else if (6 < Month && Month <= 12) {
			System.out.println("�Ϲݱ� �Դϴ�");
		} else {
			System.out.println("�׷� ���� �����ϴ�..");
		}
	}

}
