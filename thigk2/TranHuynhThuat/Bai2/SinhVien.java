package thigk2.TranHuynhThuat.Bai2;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int namSinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return this.maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return this.namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTB() {
        return this.diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    @Override
    public String toString() {
        return "{" +
            " maSV='" + getMaSV() + "'" +
            ", hoTen='" + getHoTen() + "'" +
            ", namSinh='" + getNamSinh() + "'" +
            ", diemTB='" + getDiemTB() + "'" +
            "}";
    }    
}