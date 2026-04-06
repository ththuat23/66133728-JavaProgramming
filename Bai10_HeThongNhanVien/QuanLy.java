package Bai10_HeThongNhanVien;

public class QuanLy extends NhanVien
        implements CoTheTinhLuong, CoTheXepLoai {

    private double heSoChucVu;

    public QuanLy(String ma, String ten, double lcb, double heSo) {
        super(ma, ten, lcb);
        this.heSoChucVu = heSo;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() * heSoChucVu;
    }

    @Override
    public String xepLoai() {
        return heSoChucVu >= 2 ? "A" : "B";
    }

    public double tinhThuong() {
        return tinhLuong() * 0.2;
    }
}