package TH_ArrayList_XuLyDanhSachSo;

import java.util.ArrayList;
import java.util.Scanner;

public class XuLyDanhSachSo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();

        // 1. Nhập danh sách
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            ds.add(sc.nextInt());
        }

        System.out.println("Danh sách ban đầu: " + ds);
        
        sc.close();
    }
}
