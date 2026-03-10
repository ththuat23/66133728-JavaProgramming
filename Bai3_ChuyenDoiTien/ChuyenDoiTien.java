package Bai3_ChuyenDoiTien;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd, vnd;
        double rate = 23500;

        System.out.println("=== CHƯƠNG TRÌNH QUY ĐỔI TIỀN TỆ ===");
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();

        vnd = usd * rate;

        System.out.printf("\n=== KẾT QUẢ ===\n");
        System.out.printf("Số tiền USD: %.2f USD\n", usd);
        System.out.printf("Tỷ giá: %.0f VND/USD\n", rate);
        System.out.printf("Số tiền sau quy đổi: %.2f VND\n", vnd);

        scanner.close();
    }
}
