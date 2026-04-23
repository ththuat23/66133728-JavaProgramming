package thigk2.TranHuynhThuat.Bai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Tóm tắt cách giải:
- Đọc file txt chứa 100 số nguyên
- Mỗi dòng chứa 1 số
- In toàn bộ danh sách số nguyên ra màn hình
- Kiểm tra giá trị X (ký tự cuối MSSV) có tồn tại không
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> dsSo = new ArrayList<>();

        String fileName = "thigk2/TranHuynhThuat/Bai3/numbers.txt";

        int X = 8; // Ký tự cuối MSSV là 8 (66133728)

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                int so = Integer.parseInt(line);
                dsSo.add(so);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Lỗi đọc file!");
        }

        System.out.println("=== Danh sách số nguyên ===");
        for (int so : dsSo) {
            System.out.println(so);
        }

        boolean timThay = false;

        for (int so : dsSo) {
            if (so == X) {
                timThay = true;
                break;
            }
        }

        if (timThay) {
            System.out.println("Có tồn tại giá trị X = " + X);
        } else {
            System.out.println("Không tồn tại giá trị X = " + X);
        }
    }
}