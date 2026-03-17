package Bai6_SachOOP;

public class Main {
    public static void main(String[] args) {

        // Tạo sách 1
        Sach sach1 = new Sach();
        sach1.tieuDe = "Lap trinh Java";
        sach1.tacGia = "Nguyen Van A";
        sach1.gia = 120000;
        sach1.soTrang = 350;

        // Tạo sách 2
        Sach sach2 = new Sach();
        sach2.tieuDe = "Cau truc du lieu";
        sach2.tacGia = "Tran Van B";
        sach2.gia = 150000;
        sach2.soTrang = 420;

        // Tạo sách 3
        Sach sach3 = new Sach();
        sach3.tieuDe = "Lap trinh Web";
        sach3.tacGia = "Le Van C";
        sach3.gia = 180000;
        sach3.soTrang = 500;

        // Hiển thị thông tin
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}