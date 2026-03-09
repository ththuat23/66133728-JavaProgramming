package Bai3_TinhTienDien;

import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dien tieu thu (kWh): ");
        int kwh = scanner.nextInt();

        double tien = 0;

        if (kwh <= 50) {
            tien = kwh * 1806;
        } 
        else if (kwh <= 100) {
            tien = 50 * 1806 + (kwh - 50) * 1866;
        } 
        else {
            tien = 50 * 1806 + 50 * 1866 + (kwh - 100) * 2167;
        } 
    }
}
