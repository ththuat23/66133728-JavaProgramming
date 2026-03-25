package Bai8_HinhHoc;

public class HinhTamGiac extends HinhHoc {
    private double canhA, canhB, canhC;

    public HinhTamGiac(String ten, String mauSac,
                       double a, double b, double c) {
        super(ten, mauSac);
        this.canhA = a;
        this.canhB = b;
        this.canhC = c;
    }

    public boolean kiemTraHopLe() {
        return (canhA + canhB > canhC) &&
               (canhA + canhC > canhB) &&
               (canhB + canhC > canhA);
    }

    @Override
    public double tinhChuVi() {
        return canhA + canhB + canhC;
    }

    @Override
    public double tinhDienTich() {
        if (!kiemTraHopLe()) return 0;

        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("3 cạnh: " + canhA + ", " + canhB + ", " + canhC);

        if (kiemTraHopLe()) {
            System.out.println("Diện tích: " + tinhDienTich());
            System.out.println("Chu vi: " + tinhChuVi());
        } else {
            System.out.println("Không phải tam giác hợp lệ!");
        }
    }
}