package Tuan1Lab2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		double a, b, c, delta;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập a: ");
		a = scanner.nextDouble();

		System.out.print("Nhập b: ");
		b = scanner.nextDouble();

		System.out.print("Nhập c: ");
		c = scanner.nextDouble();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} 
			else {
				System.out.println("Nghiệm của phương trình là: " + -c / b);
			}
		} 
		else {
			delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} 
			else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép là: " + -b / 2 * a);
			} 
			else {
				System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + (-b + Math.sqrt(delta)) / (2 * a)
						+ "và x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
			}

		}
	}
}
