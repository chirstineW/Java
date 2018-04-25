import java.util.Scanner;

public class A4_Midterm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入你的性別 :");

		String a = scanner.next();

		// System.out.print("請輸入你的血型 :");

		// String b = scanner.next();

		if (a.equals("M")) {

			System.out.print("請輸入你的血型 :");

			String b = scanner.next();

			if (b.equals("O")) {

				System.out.print("請輸入你的生肖 :");

				String c = scanner.next();

				if (c.equals("雞")) {

					System.out.print("恭喜,您符合應徵資格!");
				} else {
					System.out.print("no");
				}

			} else {
				System.out.print("no");
			}

		}

		else if (a.equals("F")) {

			System.out.print("請輸入你的血型 :");
			String b = scanner.next();
			if (b.equals("A")) {

				System.out.print("請輸入你的生肖 :");
				String c = scanner.next();

				if (c.equals("馬")) {
					System.out.print("恭喜,您符合應徵資格!");
				} else {
					System.out.print("no");
				}

			} else {
				System.out.print("no");
			}

		}
	}

}
