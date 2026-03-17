package Bai5_QuanLyDiemSinhVien;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyDiemSinhVien {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        double[] scores = new double[n];

        // Nhập điểm
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap diem sinh vien " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
        }

        // Hiển thị danh sách điểm
        System.out.println("\nDanh sach diem:");
        for (double s : scores) {
            System.out.printf("%.2f ", s);
        }

        // Stream API tính toán
        double avg = Arrays.stream(scores).average().orElse(0);
        double max = Arrays.stream(scores).max().orElse(0);
        double min = Arrays.stream(scores).min().orElse(0);

        System.out.printf("\n\nDiem trung binh: %.2f", avg);
        System.out.printf("\nDiem cao nhat: %.2f", max);
        System.out.printf("\nDiem thap nhat: %.2f\n", min);

        // Sắp xếp tăng dần
        Arrays.sort(scores);

        System.out.println("\nDanh sach diem sau khi sap xep tang dan:");
        for (double s : scores) {
            System.out.printf("%.2f ", s);
        }

        scanner.close();
    }
}
