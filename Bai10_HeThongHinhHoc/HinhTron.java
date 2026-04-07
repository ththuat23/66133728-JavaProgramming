package Bai10_HeThongHinhHoc;

public class HinhTron extends HinhHoc implements CoTheQuay, CoTheDiChuyen {

    private double banKinh;

    public HinhTron(double x, double y, double r) {
        super("Hình tròn", x, y);
        this.banKinh = r;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public void quay(double goc) {
        System.out.println(getTen() + " quay " + goc + " độ");
    }

    @Override
    public void diChuyen(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
        System.out.println(getTen() + " đến (" + getX() + ", " + getY() + ")");
    }
}