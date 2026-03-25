package Bai8_NhanVien;
// File: MainNhanVien.java
public class MainNhanVien {
    public static void main(String[] args) {

        // Tạo các đối tượng
        NhanVien nv1 = new NhanVien("NV01", "Nguyễn Văn A", 5000);

        NhanVienKinhDoanh nv2 = new NhanVienKinhDoanh(
                "NV02", "Trần Thị B", 5000, 20000, 10);

        NhanVienVanPhong nv3 = new NhanVienVanPhong(
                "NV03", "Lê Văn C", 5000, 20, 50);

        QuanLy nv4 = new QuanLy(
                "NV04", "Phạm Văn D", 7000, 2000, 1.5);
        // Hiển thị thông tin
        System.out.println("\n=== NHÂN VIÊN THƯỜNG ===");
        nv1.hienThiThongTin();
        System.out.println("Tổng lương: " + nv1.tinhLuong());

        System.out.println("\n=== NHÂN VIÊN KINH DOANH ===");
        nv2.hienThiThongTin();
        nv2.chamSocKhachHang();

        System.out.println("\n=== NHÂN VIÊN VĂN PHÒNG ===");
        nv3.hienThiThongTin();

        System.out.println("\n=== QUẢN LÝ ===");
        nv4.hienThiThongTin();
        nv4.hopBanGiamDoc();
    }
}