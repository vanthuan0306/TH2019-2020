package Tuan1Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phần tử trong mảng: ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		// Nhập mảng
		System.out.println("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Phần tử " + i + ": ");
			a[i] = scanner.nextInt();
		}
		// Sap xep
		Arrays.sort(a);
		System.out.println(" Mảng được sắp xếp: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		// Tìm min
		int Min = a[0];
		for (int i = 0; i < n; i++) {
			Min = Math.min(Min, a[i]);
		}
		System.out.println();
		System.out.println("phần tử nhỏ nhất của mảng là: " + Min);

		// tinh tong trung binh phan tu chia het cho 3
		int tong = 0;
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 3 == 0) {
				tong = tong + a[i];
				System.out.println(tong);
				dem++;
				System.out.println(dem);
			}
		}
		System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + (float) tong / dem);
	}
}
