package TongHopTaiLieu.QLNV;

public class NhanVienVanPhong extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public NhanVienVanPhong(String maNV,
                            String hoTen,
                            int namSinh,
                            double luongCoBan,
                            double heSoLuong) {
        super(maNV, hoTen, namSinh);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
}