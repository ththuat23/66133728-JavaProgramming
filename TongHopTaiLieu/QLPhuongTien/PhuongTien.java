package TongHopTaiLieu.QLPhuongTien;

public abstract class PhuongTien {

    private String maPT;
    private String tenPT;
    private String hangSX;

    public PhuongTien() {
    }

    public PhuongTien(String maPT, String tenPT, String hangSX) {
        this.maPT = maPT;
        this.tenPT = tenPT;
        this.hangSX = hangSX;
    }

    public String getMaPT() {
        return maPT;
    }

    public void setMaPT(String maPT) {
        this.maPT = maPT;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public abstract double tinhPhiBaoTri();

    @Override
    public String toString() {
        return "Ma PT: " + maPT
                + ", Ten PT: " + tenPT
                + ", Hang SX: " + hangSX
                + ", Phi bao tri: " + tinhPhiBaoTri();
    }
}