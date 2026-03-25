package Bai8_TaiKhoanNganHang;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double hanMucRut;
    private double phiGiaoDich;

    public TaiKhoanThanhToan(String soTK, String ten, double soDu,
                             double hanMucRut, double phiGiaoDich) {
        super(soTK, ten, soDu);
        this.hanMucRut = hanMucRut;
        this.phiGiaoDich = phiGiaoDich;
    }

    @Override
    public void rutTien(double soTien) {
        double tongTien = soTien + phiGiaoDich;

        if (soTien > hanMucRut) {
            System.out.println("Vượt hạn mức rút!");
        } else if (tongTien <= soDu) {
            soDu -= tongTien;
            System.out.println("Rút thành công: " + soTien +
                    " (Phí: " + phiGiaoDich + ")");
        } else {
            System.out.println("Không đủ tiền!");
        }
    }

    public void thanhToanHoaDon(double soTien) {
        if (soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Thanh toán hóa đơn: " + soTien);
        } else {
            System.out.println("Không đủ tiền để thanh toán!");
        }
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Hạn mức rút: " + hanMucRut);
        System.out.println("Phí giao dịch: " + phiGiaoDich);
    }
}