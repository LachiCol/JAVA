public class chapter4_2 {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
