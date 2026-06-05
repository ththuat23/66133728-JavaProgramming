package Bai2_ChuyenDoiTien;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usd, eur;
        double vndFromUSD, vndFromEUR;

        System.out.print("Nhap so tien USD: ");
        usd = sc.nextDouble();

        System.out.print("Nhap so tien EUR: ");
        eur = sc.nextDouble();

        vndFromUSD = usd * 23500;
        vndFromEUR = eur * 27000;

        System.out.println("Tien VND tu USD: " + vndFromUSD);
        System.out.println("Tien VND tu EUR: " + vndFromEUR);

        sc.close();
    }
}
