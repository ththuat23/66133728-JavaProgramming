import java.util.Scanner;
// Bài 1: tính tiền lương
public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soGio;
        double luongGio;
        double tongLuong;

        System.out.print("Nhap so gio lam: ");
        soGio = sc.nextDouble();

        System.out.print("Nhap luong theo gio: ");
        luongGio = sc.nextDouble();

        if (soGio > 40) {
            tongLuong = 40 * luongGio + (soGio - 40) * luongGio * 1.5;
        } else {
            tongLuong = soGio * luongGio;
        }

        System.out.println("Tong luong: " + tongLuong);
    }
}
