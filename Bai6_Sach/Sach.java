package Bai6_Sach;

public class Sach {

    // Thuộc tính
    String tieuDe;
    String tacGia;
    double gia;
    int soTrang;

    // Phương thức hiển thị thông tin
    void hienThiThongTin() {
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Giá: " + gia);
        System.out.println("Số trang: " + soTrang);
        System.out.println("---------------------");
    }
}