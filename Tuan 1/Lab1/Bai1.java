package Tuan1Lab1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		String hoTen;
		double diem;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập điểm: ");
		diem = scanner.nextDouble();
		System.out.println(hoTen + " " + diem + " điểm");
	}

}
