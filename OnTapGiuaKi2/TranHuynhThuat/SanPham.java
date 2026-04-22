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
    //Getter và Setter
    public String getMaSP() {
        return this.maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return this.tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return this.gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // Tính thành tiền
    public double tinhThanhTien() {
        return gia * soLuong;
    }

    // Hiển thị
    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá: " + gia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}