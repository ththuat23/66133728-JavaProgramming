package Bai10_HeThongNhanVien;

public class NhanVienKinhDoanh extends NhanVien implements CoTheTinhLuong, CoTheXepLoai {

    private double doanhSo;

    public NhanVienKinhDoanh(String ma, String ten, double lcb, double doanhSo) {
        super(ma, ten, lcb);
        this.doanhSo = doanhSo;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + doanhSo * 0.05;
    }

    @Override
    public String xepLoai() {
        return doanhSo > 100000000 ? "A" : "B";
    }

    public double tinhThuong() {
        return doanhSo * 0.02;
    }
}