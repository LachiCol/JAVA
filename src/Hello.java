
import java.util.Scanner;

public class Hello {
static int A;
static int B;
static int C;
static int D;
static int E;
	public static void main(String[] args) {
		System.out.println("1000�� �̸��� �Ž������� �Է��Ͻÿ�.");
		Scanner input = new Scanner(System.in);
		int W = input.nextInt();
		
		if (W >= 1000) {
			 System.out.println("�Է��� �ݾ��� 1000�� �̻��Դϴ�.");
			 return;
		}
		
		while (true) {
			if (W >= 500) {
				W = W - 500;
				A++;
				continue;
			}
			if (W >= 100) {
				W = W - 100;
				B++;
				continue;
			}
			if (W >= 50) {
				W = W - 50;
				C++;
				continue;
			}
			if (W >= 10) {
				W = W - 10;
				D++;
				continue;
			}
			if (W >= 1) {
				W = W - 1;
				E++;
				continue;

			}
			if (W == 0) {
				break;
			}
		}
		
		
		System.out.println("�Ž������� 500�� "+A+"��, 100�� "+B+"��, 50��"+
		C+"��, 10�� "+D+"��, 1��"+E+"�� �Դϴ�.");
	}

}
