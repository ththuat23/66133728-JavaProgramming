package ViDuStreamDocChuoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViDuDocStream {
    public static void main(String[] args) throws IOException {
        // Khai báo biến đối tượng
        InputStreamReader ipReader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(ipReader);
        // In 1 câu hướng dẫn để User biết cần phải làm gì
        System.out.println("Nhập một chuỗi bất kỳ: ");
        // Đọc dữ liệu từ bàn phím, cất các biến chuỗi
        String lineDocDuoc = bufReader.readLine();
        

    }
}
