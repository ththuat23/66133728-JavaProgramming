package TongHopTaiLieu.QLNV;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private int namSinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, int namSinh) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "Ma NV: " + maNV +
               ", Ho ten: " + hoTen +
               ", Nam sinh: " + namSinh +
               ", Luong: " + tinhLuong();
    }
}