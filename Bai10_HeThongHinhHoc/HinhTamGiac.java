package Bai10_HeThongHinhHoc;

public class HinhTamGiac extends HinhHoc implements CoTheQuay {

    private double a, b, c;

    public HinhTamGiac(double x, double y, double a, double b, double c) {
        super("Hình tam giác", x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void quay(double goc) {
        System.out.println(getTen() + " quay " + goc + " độ");
    }
}