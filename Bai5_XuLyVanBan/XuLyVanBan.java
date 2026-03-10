package Bai5_XuLyVanBan;

import java.util.*;
import java.util.stream.*;

public class XuLyVanBan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHẬP ĐOẠN VĂN BẢN ===");
        String text = scanner.nextLine();

        // Đếm số từ
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;

        // Đếm số câu
        String[] sentences = text.split("[.!?]");
        int sentenceCount = sentences.length;
    }
}
