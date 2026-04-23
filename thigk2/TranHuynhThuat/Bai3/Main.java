package thigk2.TranHuynhThuat.Bai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Tóm tắt cách giải:
- Đọc file txt chứa danh sách số nguyên
- Mỗi dòng chứa 1 số
- In toàn bộ danh sách số nguyên ra màn hình
- MSSV nhập dưới dạng String: "66133728"
- Lấy ký tự cuối cùng để gán cho X
- Nếu MSSV = "66133728" thì X = 8
- Kiểm tra X có tồn tại trong danh sách hay không
*/

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> dsSo = new ArrayList<>();

        // Đường dẫn file txt
        String fileName = "thigk2/TranHuynhThuat/Bai3/numbers.txt";

        // MSSV dạng String
        String mssv = "66133728";

        // Lấy số cuối cùng của MSSV
        int X = Character.getNumericValue(
                mssv.charAt(mssv.length() - 1)
        );

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                int so = Integer.parseInt(line);
                dsSo.add(so);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Lỗi đọc file!");
        }

        // In danh sách số nguyên
        System.out.println("=== Danh sách số nguyên ===");
        for (int so : dsSo) {
            System.out.println(so);
        }

        // In MSSV và giá trị X
        System.out.println("\nMSSV = " + mssv);
        System.out.println("Giá trị X (số cuối MSSV) = " + X);

        // Kiểm tra X có tồn tại không
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