import java.util.Scanner;

public class chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("������ ������ �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		{
			do {
				System.out.print(n % 10);
				n /= 10;
			} while (n != 0);
		}
	}

}
