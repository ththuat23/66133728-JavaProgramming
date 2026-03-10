package Bai3_NhatKyCaNhan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NhatKyCaNhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHẬT KÝ CÁ NHÂN ===");

        System.out.print("Nhập ngày: ");
        String date = scanner.nextLine();

        System.out.print("Nhập nội dung nhật ký: ");
        String content = scanner.nextLine();
    }
}