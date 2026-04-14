package ViDuStreamDocChuoi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {
    public static void main(String[] args) throws IOException {

        FileInputStream fInput = new FileInputStream("baitho.txt");

        // Khai báo biến đối tượng
        InputStreamReader ipReader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(ipReader);

        // Đọc dữ liệu từ file, cất các biến chuỗi
        String line1 = bufReader.readLine();
        // In ra dòng đọc được
        System.out.println(line1);
        String line2 = bufReader.readLine();
        // In ra dòng đọc được
        System.out.println(line2);

    }
}
