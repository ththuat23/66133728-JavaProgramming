package Bai6_HinhChuNhatOOP;

import java.util.Scanner;

public class MainHinhChuNhat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng hình chữ nhật
        HinhChuNhat hcn = new HinhChuNhat();

        // Nhập dữ liệu
        System.out.print("Nhập chiều dài: ");
        hcn.chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        hcn.chieuRong = scanner.nextDouble();

        System.out.println("\n=== THÔNG TIN HÌNH CHỮ NHẬT ===");

        // Hiển thị thông tin
        hcn.hienThiThongTin();

        scanner.close();
    }
}