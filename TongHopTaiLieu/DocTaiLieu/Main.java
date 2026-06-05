package TongHopTaiLieu.DocTaiLieu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> dsDiem = new ArrayList<>();

        String fileName = "TongHopTaiLieu/DocTaiLieu/scores.txt";

        String mssv = "66133725";

        int X = Character.getNumericValue(
                mssv.charAt(mssv.length() - 1));

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                int diem = Integer.parseInt(line);
                dsDiem.add(diem);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Lỗi đọc file!");
            return;
        }

        System.out.println("=== DANH SÁCH ĐIỂM ===");

        for (int diem : dsDiem) {
            System.out.println(diem);
        }

        System.out.println("\nMSSV = " + mssv);
        System.out.println("X = " + X);

        int dem = 0;

        for (int diem : dsDiem) {
            if (diem == X) {
                dem++;
            }
        }

        System.out.println(
                "Giá trị " + X +
                " xuất hiện " + dem +
                " lần trong danh sách");
    }
}