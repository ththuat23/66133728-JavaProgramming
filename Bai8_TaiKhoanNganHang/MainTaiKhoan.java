package Bai8_TaiKhoanNganHang;

public class MainTaiKhoan {
    public static void main(String[] args) {

        TaiKhoanTietKiem tk1 = new TaiKhoanTietKiem(
                "TK01", "Nguyễn Văn A", 10000000, 12, 6.5);

        TaiKhoanThanhToan tk2 = new TaiKhoanThanhToan(
                "TK02", "Trần Thị B", 5000000, 2000000, 5000);

        System.out.println("\n=== TÀI KHOẢN TIẾT KIỆM ===");
        tk1.hienThiThongTin();
        tk1.rutTien(1000000); // test

        System.out.println("\n=== TÀI KHOẢN THANH TOÁN ===");
        tk2.hienThiThongTin();
        tk2.rutTien(1000000);
        tk2.thanhToanHoaDon(500000);
        tk2.hienThiThongTin();
    }
}