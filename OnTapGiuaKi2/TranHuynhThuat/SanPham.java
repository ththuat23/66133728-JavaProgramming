package OnTapGiuaKi2.TranHuynhThuat;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    // Constructor
    public SanPham() {}

    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        this.maSP=maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
    }
}