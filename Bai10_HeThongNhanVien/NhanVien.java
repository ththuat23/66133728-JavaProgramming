package Bai10_HeThongNhanVien;

public abstract class NhanVien {
    private String maNV;
    private String tenNV;
    private double luongCoBan;

    public NhanVien() {}

    public NhanVien(String maNV, String tenNV, double luongCoBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCoBan = luongCoBan;
    }

    // Getter/Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    // phương thức hiển thị
    @Override
    public String toString() {
        return "Mã: " + maNV +
               ", Tên: " + tenNV +
               ", LCB: " + luongCoBan;
    }
}