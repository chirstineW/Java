import java.util.Scanner;

public class A4_Midterm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("�п�J�A���ʧO :");

		String a = scanner.next();

		// System.out.print("�п�J�A���嫬 :");

		// String b = scanner.next();

		if (a.equals("M")) {

			System.out.print("�п�J�A���嫬 :");

			String b = scanner.next();

			if (b.equals("O")) {

				System.out.print("�п�J�A���ͨv :");

				String c = scanner.next();

				if (c.equals("��")) {

					System.out.print("����,�z�ŦX���x���!");
				} else {
					System.out.print("no");
				}

			} else {
				System.out.print("no");
			}

		}

		else if (a.equals("F")) {

			System.out.print("�п�J�A���嫬 :");
			String b = scanner.next();
			if (b.equals("A")) {

				System.out.print("�п�J�A���ͨv :");
				String c = scanner.next();

				if (c.equals("��")) {
					System.out.print("����,�z�ŦX���x���!");
				} else {
					System.out.print("no");
				}

			} else {
				System.out.print("no");
			}

		}
	}

}
