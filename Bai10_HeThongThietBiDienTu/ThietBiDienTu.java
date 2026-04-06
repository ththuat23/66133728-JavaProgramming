package Bai10_HeThongThietBiDienTu;

public abstract class ThietBiDienTu {
    private String ten;
    private double gia;
    private String hangSanXuat;

    public ThietBiDienTu() {}

    public ThietBiDienTu(String ten, double gia, String hangSanXuat) {
        this.ten = ten;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
    }

    // Getter, Setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    // abstract
    public abstract void bat();
    public abstract void tat();

    // toString
    @Override
    public String toString() {
        return "Tên: " + ten +
               ", Giá: " + gia +
               ", Hãng: " + hangSanXuat;
    }
}