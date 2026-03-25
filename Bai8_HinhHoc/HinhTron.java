package Bai8_HinhHoc;

public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(String ten, String mauSac, double banKinh) {
        super(ten, mauSac);
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
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bán kính: " + banKinh);
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}