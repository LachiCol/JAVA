import java.util.Scanner;

public class Sum_Avg {

	public static void main(String[] args) {
		System.out.println("���� �ΰ��� �Է��ϼ���.");
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();

		double SUM = A + B;
		double AVG = SUM / 2.0;
		System.out.println("��: " + SUM);
		System.out.println("���: " + AVG);
	}

}
