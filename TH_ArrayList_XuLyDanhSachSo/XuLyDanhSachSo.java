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

        // 2. Loại bỏ trùng lặp
        for (int i = 0; i < ds.size(); i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                if (ds.get(i).equals(ds.get(j))) {
                    ds.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Sau khi xóa trùng: " + ds);

        sc.close();
    }
}
