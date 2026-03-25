package Bai8_TaiKhoanNganHang;

public class TaiKhoanTietKiem extends TaiKhoan {
    private int kyHan;        // tháng
    private double laiSuat;   // %

    public TaiKhoanTietKiem(String soTK, String ten, double soDu,
                            int kyHan, double laiSuat) {
        super(soTK, ten, soDu);
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
    }

    public double tinhLaiSuat() {
        return soDu * laiSuat / 100 * kyHan / 12;
    }

    @Override
    public void rutTien(double soTien) {
        System.out.println("Không thể rút tiền trước kỳ hạn (" + kyHan + " tháng)!");
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Kỳ hạn: " + kyHan + " tháng");
        System.out.println("Lãi suất: " + laiSuat + "%");
        System.out.println("Tiền lãi dự kiến: " + tinhLaiSuat());
    }
}