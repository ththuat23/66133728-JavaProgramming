package TongHopTaiLieu.QLNV;

public class NhanVienSanXuat extends NhanVien {
    private int soSanPham;
    private double donGia;

    public NhanVienSanXuat(String maNV,
                           String hoTen,
                           int namSinh,
                           int soSanPham,
                           double donGia) {
        super(maNV, hoTen, namSinh);
        this.soSanPham = soSanPham;
        this.donGia = donGia;
    }

    @Override
    public double tinhLuong() {
        return soSanPham * donGia;
    }
}