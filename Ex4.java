package Tuan1Lab2;

 import java.util.Scanner;

 public class Ex4 {

 	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);

 		do {
			System.out.println("+---------------------------+");
			System.out.println("  1. Giải phương trình bậc 1 ");
			System.out.println("  2. Giải phương trình bậc 2 ");
			System.out.println("  3. Tính tiền điện          ");
			System.out.println("  4. Kết thúc                ");
			System.out.println("+---------------------------+");
			System.out.println("Chọn chức năng:_");

 			a = scanner.nextInt();
		} 
		while (a < 0 && a > 5);
		switch (a) {
		case 1:
			giaiPTB1();
			break;
		case 2:
			giaiPTB2();
			break;
		case 3:
			tinhTienDien();
			break;
		default:
			System.out.println("Kết thúc");
			break;
		}
	}

 	public static void giaiPTB1() {
		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = scanner.nextDouble();
		System.out.println("Nhập b: ");
		b = scanner.nextDouble();

 		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			System.out.println("Nghiệm của phương trình là: " + -b / a);
		}
	}

 	public static void giaiPTB2() {
		double a, b, c, delta;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = scanner.nextDouble();
		System.out.println("Nhập b: ");
		b = scanner.nextDouble();
		System.out.println("Nhập c: ");
		c = scanner.nextDouble();

 		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} 
				else {
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

 	public static void tinhTienDien() {
		double soDien;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		soDien = scanner.nextDouble();

 		if (soDien < 50) {
			System.out.println("Tiền điện của quý khách là: " + soDien * 1000);
		} else {
			System.out.println("Tiền điện của quý khách là: " + soDien * 1200);
		}
	}