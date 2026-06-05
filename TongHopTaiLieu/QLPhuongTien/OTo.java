package TongHopTaiLieu.QLPhuongTien;

public class OTo extends PhuongTien {

    private int soChoNgoi;

    public OTo(String maPT,
               String tenPT,
               String hangSX,
               int soChoNgoi) {

        super(maPT, tenPT, hangSX);
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public double tinhPhiBaoTri() {
        return soChoNgoi * 50000;
    }
}