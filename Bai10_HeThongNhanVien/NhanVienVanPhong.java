package Bai10_HeThongNhanVien;

public class NhanVienVanPhong extends NhanVien implements CoTheTinhLuong, CoTheXepLoai {

    private int soNgayCong;

    public NhanVienVanPhong(String ma, String ten, double lcb, int ngay) {
        super(ma, ten, lcb);
        this.soNgayCong = ngay;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soNgayCong * 100000;
    }

    @Override
    public String xepLoai() {
        return soNgayCong >= 26 ? "A" : "B";
    }

    public double tinhThuong() {
        return tinhLuong() * 0.1;
    }
}