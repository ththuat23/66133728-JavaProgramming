package Bai8_HinhHoc;

public class MainHinhHoc {
    public static void main(String[] args) {

        HinhChuNhat hcn = new HinhChuNhat("Hình chữ nhật", "Đỏ", 5, 3);
        HinhTron ht = new HinhTron("Hình tròn", "Xanh", 2.5);
        HinhTamGiac htg = new HinhTamGiac("Tam giác", "Vàng", 3, 4, 5);

        System.out.println("\n=== HÌNH CHỮ NHẬT ===");
        hcn.hienThiThongTin();

        System.out.println("\n=== HÌNH TRÒN ===");
        ht.hienThiThongTin();

        System.out.println("\n=== HÌNH TAM GIÁC ===");
        htg.hienThiThongTin();
    }
}