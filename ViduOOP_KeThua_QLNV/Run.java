package ViduOOP_KeThua_QLNV;

public class Run {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("001", "Trần Huỳnh Thuật", 2300000.0);
        // nv1.hienThiThongTin();
        System.out.println(nv1.toString());

        NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong("002", "Trần Thị Tươi Thắm", 230000, 3, 200000);
        System.out.println(nvVanPhong1.toString());
        // nvVanPhong1.hienThiThongTin();
    }
}
