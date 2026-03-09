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
        else if (kwh <= 200) {
            tien = 50 * 1806 + 50 * 1866 + (kwh - 100) * 2167;
        } 
        else if (kwh <= 300) {
            tien = 50 * 1806 + 50 * 1866 + 100 * 2167 + (kwh - 200) * 2729;
        } 
        else if (kwh <= 400) {
            tien = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + (kwh - 300) * 3050;
        } 
        else {
            tien = 50 * 1806 + 50 * 1866 + 100 * 2167 + 100 * 2729 + 100 * 3050 + (kwh - 400) * 3151;
        }

        System.out.printf("Tien dien phai tra: %.2f VND", tien);

        scanner.close();
    }
}