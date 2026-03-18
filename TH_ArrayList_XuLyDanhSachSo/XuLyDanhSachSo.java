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
        
        // 3. Tìm số lớn thứ 2
        int max = ds.get(0);
        int secondMax = Integer.MIN_VALUE;

        for (int x : ds) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x < max) {
                secondMax = x;
            }
        }
        System.out.println("Số lớn thứ 2: " + secondMax);

        // 4. Trung bình cộng số chẵn
        int tongChan = 0;
        int demChan = 0;

        for (int x : ds) {
            if (x % 2 == 0) {
                tongChan += x;
                demChan++;
            }
        }

        if (demChan > 0)
            System.out.println("TBC số chẵn: " + (double) tongChan / demChan);
        else
            System.out.println("Không có số chẵn");

        sc.close();
    }
}
