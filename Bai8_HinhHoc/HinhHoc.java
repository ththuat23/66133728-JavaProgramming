package Bai8_HinhHoc;

public class HinhHoc {
    protected String ten;
    protected String mauSac;

    public HinhHoc(String ten, String mauSac) {
        this.ten = ten;
        this.mauSac = mauSac;
    }

    public double tinhDienTich() {
        return 0;
    }

    public double tinhChuVi() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Màu sắc: " + mauSac);
    }
}