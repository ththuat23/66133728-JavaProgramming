package Bai8_PhuongTien;

public class PhuongTien {
    protected String hangSanXuat;
    protected int namSanXuat;
    protected double giaBan;

    public PhuongTien(String hangSanXuat, int namSanXuat, double giaBan) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
    }

    public double layVanTocToiDa() {
        return 0;
    }

    public int laySoChoNgoi() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Hãng: " + hangSanXuat);
        System.out.println("Năm SX: " + namSanXuat);
        System.out.println("Giá bán: " + giaBan);
    }
}