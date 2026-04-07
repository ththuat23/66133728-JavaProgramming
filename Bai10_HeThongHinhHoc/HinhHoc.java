package Bai10_HeThongHinhHoc;

public abstract class HinhHoc {
    private String ten;
    private double x;
    private double y;

    public HinhHoc(String ten, double x, double y) {
        this.ten = ten;
        this.x = x;
        this.y = y;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract double tinhDienTich();
    public abstract double tinhChuVi();

    @Override
    public String toString() {
        return ten + " tại (" + x + ", " + y + ")";
    }
}