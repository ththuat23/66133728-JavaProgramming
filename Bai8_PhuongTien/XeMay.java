package Bai8_PhuongTien;

public class XeMay extends PhuongTien {
    private int dungTichXiLanh;
    private String loaiXe; // số / tay ga

    public XeMay(String hang, int nam, double gia,
                 int dungTichXiLanh, String loaiXe) {
        super(hang, nam, gia);
        this.dungTichXiLanh = dungTichXiLanh;
        this.loaiXe = loaiXe;
    }

    @Override
    public double layVanTocToiDa() {
        if (dungTichXiLanh < 100) return 80;
        else if (dungTichXiLanh <= 150) return 100;
        else return 120;
    }

    @Override
    public int laySoChoNgoi() {
        return 2;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Dung tích: " + dungTichXiLanh + "cc");
        System.out.println("Loại xe: " + loaiXe);
        System.out.println("Vận tốc tối đa: " + layVanTocToiDa());
        System.out.println("Số chỗ: " + laySoChoNgoi());
    }
}