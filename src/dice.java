import java.util.Scanner;

public class dice {

	static int diceNum, Roll;
	static int count[] = new int[6];

	public static void main(String[] args) {

		System.out.println("100���� �ֻ����� �����ϴ�.");
		System.out.println("�ֻ��� ���� ������.");
		Scanner input = new Scanner(System.in);
		diceNum = input.nextInt(); // �Է��� �ֻ����� ��

		if (diceNum >= 1 && diceNum <= 6) { // ���� �ֻ����� 1�̻� 6���ϸ�
			System.out.println(+diceNum + "�� �ֻ����� �����߽��ϴ�.");
			for (int i = 0; i < 100; i++) { // 100���� �ֻ��� ������ ����
				Roll = (int) (Math.random() * 10); // ������ ��������� �����
				while (Roll > 5) {
					Roll = (int) (Math.random() * 10);
				}
				for (int j = 0; j < 6; j++) {
					if (Roll == j) {
						count[j]++;
					}
				}
				Roll++;
			}

			System.out.println("\n �ֻ��� ������ �õ� Ƚ�� 100�� �߿�\n");
			for (int i = 0; i < 6; i++) { // 1���� 6������ �ֻ��� �߿�

				System.out.println(i + 1 + "������ " + count[i] + "�� ���Խ��ϴ�.");
			}
		} else { // ���� �ùٸ��� ���� ���� �Է��ϸ� ���� ���
			System.err.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
	}
}
