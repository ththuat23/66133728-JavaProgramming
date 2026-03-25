package Bai8_PhuongTien;

public class MainPhuongTien {
    public static void main(String[] args) {

        XeMay xm = new XeMay("Honda", 2022, 30000, 110, "tay ga");
        Oto oto = new Oto("Toyota", 2023, 800000, 5, "xăng");

        System.out.println("\n=== XE MÁY ===");
        xm.hienThiThongTin();

        System.out.println("\n=== Ô TÔ ===");
        oto.hienThiThongTin();
    }
}