import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, x;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();

        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            x = -b / a;
            System.out.println("Nghiem x = " + x);
        }
    }
}