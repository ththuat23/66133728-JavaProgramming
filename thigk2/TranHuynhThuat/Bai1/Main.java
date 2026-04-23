package thigk2.TranHuynhThuat.Bai1;

import java.util.Scanner;

/*
Tóm tắt cách giải:
- Nhập chiều cao và cân nặng từ bàn phím
- Tính chỉ số BMI = cân nặng / (chiều cao * chiều cao)
- Dựa vào BMI để phân loại tình trạng cơ thể
- In kết quả ra màn hình
*/

public class Main {
    public static void main(String[] args) {
        Scanner banPhim = new Scanner(System.in);

        double chieuCao;
        double canNang;
        double bmi;

        System.out.print("Nhập chiều cao (m): ");
        chieuCao = banPhim.nextDouble();

        System.out.print("Nhập cân nặng (kg): ");
        canNang = banPhim.nextDouble();

        bmi = canNang / (chieuCao * chieuCao);

        System.out.printf("Chỉ số BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Tình trạng: Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Tình trạng: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Tình trạng: Thừa cân");
        } else {
            System.out.println("Tình trạng: Béo phì");
        }

        banPhim.close();
    }
}