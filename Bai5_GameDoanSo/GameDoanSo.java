package Bai5_GameDoanSo;

import java.util.Random;
import java.util.Scanner;

public class GameDoanSo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playAgain;

        do {
            int secretNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 10;
            boolean win = false;

            System.out.println("=== GAME ĐOÁN SỐ ===");
            System.out.println("Máy đã chọn số từ 1 đến 100.");
            System.out.println("Bạn có 10 lần đoán!");

            while (attempts < maxAttempts) {

                System.out.print("Nhập số đoán: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Chúc mừng! Bạn đoán đúng.");
                    win = true;
                    break;
                }
                else if (guess < secretNumber) {
                    System.out.println("Số bí mật lớn hơn!");
                } 
                else {
                    System.out.println("Số bí mật nhỏ hơn!");
                }
            }
        }
    }
}
