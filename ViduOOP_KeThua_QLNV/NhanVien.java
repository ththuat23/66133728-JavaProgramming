package ViduOOP_KeThua_QLNV;

public class NhanVien {

    private String maNV;
    private String hoTen;
    private double luongCoBan;

    public NhanVien(String maNhanVien, String tenNhanVien, double luongCoBan) {
        super();
        this.maNV = maNhanVien;
        this.hoTen = tenNhanVien;
        this.luongCoBan = luongCoBan;
    }
    public NhanVien() {
        super();
    }
    public double tinhLuong() {
        return luongCoBan;
    }
    @Override
    public String toString() {
        return "NhanVien [maNV=" + maNV + ", hoTen= " + hoTen +", luongCoBan= " + luongCoBan + "]";
    }

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
}
