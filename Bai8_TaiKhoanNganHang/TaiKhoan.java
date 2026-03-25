package Bai8_TaiKhoanNganHang;

public class TaiKhoan {
    protected String soTaiKhoan;
    protected String tenChuTaiKhoan;
    protected double soDu;

    public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDu;
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi thành công: " + soTien);
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công: " + soTien);
        } else {
            System.out.println("Rút tiền thất bại!");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Số TK: " + soTaiKhoan);
        System.out.println("Chủ TK: " + tenChuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}