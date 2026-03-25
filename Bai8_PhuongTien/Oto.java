package Bai8_PhuongTien;

public class Oto extends PhuongTien {
    private int soCho;
    private String kieuDongCo; // xăng / dầu / điện

    public Oto(String hang, int nam, double gia,
               int soCho, String kieuDongCo) {
        super(hang, nam, gia);
        this.soCho = soCho;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public double layVanTocToiDa() {
        if (kieuDongCo.equalsIgnoreCase("điện")) return 150;
        else return 180;
    }

    @Override
    public int laySoChoNgoi() {
        return soCho;
    }

    // Thuế trước bạ (giả lập đơn giản)
    public double tinhThueTruocBa() {
        return giaBan * 0.1; // 10%
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số chỗ: " + soCho);
        System.out.println("Động cơ: " + kieuDongCo);
        System.out.println("Vận tốc tối đa: " + layVanTocToiDa());
        System.out.println("Thuế trước bạ: " + tinhThueTruocBa());
    }
}