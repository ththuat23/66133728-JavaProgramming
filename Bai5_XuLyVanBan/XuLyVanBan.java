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

        // Tìm từ xuất hiện nhiều nhất (dùng parallelStream)
        Map<String, Long> wordFrequency =
                Arrays.stream(words)
                        .parallel()
                        .collect(Collectors.groupingBy(
                                w -> w.toLowerCase(),
                                Collectors.counting()
                        ));

        String mostFrequentWord = wordFrequency.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        long frequency = wordFrequency.get(mostFrequentWord);

        // Đảo ngược văn bản
        String reversed = new StringBuilder(text).reverse().toString();

        // In kết quả
        System.out.println("\n=== KẾT QUẢ ===");
        System.out.println("Số từ: " + wordCount);
        System.out.println("Số câu: " + sentenceCount);
        System.out.println("Từ xuất hiện nhiều nhất: " + mostFrequentWord + " (" + frequency + " lần)");
        System.out.println("Văn bản đảo ngược:");
        System.out.println(reversed);

        scanner.close();
    }
}