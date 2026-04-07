package Bai10_HeThongHinhHoc;

public class HinhVuong extends HinhHoc implements CoTheDiChuyen {

    private double canh;

    public HinhVuong(double x, double y, double canh) {
        super("Hình vuông", x, y);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public void diChuyen(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
        System.out.println(getTen() + " đến (" + getX() + ", " + getY() + ")");
    }
}