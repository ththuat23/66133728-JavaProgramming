package TongHopTaiLieu.QLPhuongTien;

public class XeMay extends PhuongTien {

    private int dungTich;

    public XeMay(String maPT,
                 String tenPT,
                 String hangSX,
                 int dungTich) {

        super(maPT, tenPT, hangSX);
        this.dungTich = dungTich;
    }

    @Override
    public double tinhPhiBaoTri() {
        return dungTich * 1000;
    }
}