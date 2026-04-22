package OnTapGiuaKi2.TranHuynhThuat;

/*
Tóm tắt:
- Tạo lớp SanPham với các thuộc tính private
- Sử dụng constructor để khởi tạo
- Áp dụng getter/setter có kiểm tra dữ liệu hợp lệ
- Tính thành tiền = giá * số lượng
- Hiển thị thông tin sản phẩm
*/

public class Run {
    public static void main(String[] args) {

        // Tạo bằng constructor có tham số
        SanPham sp1 = new SanPham("SP01", "Bàn phím", 500000, 2);

        // Tạo bằng constructor mặc định
        SanPham sp2 = new SanPham();
        sp2.setMaSP("SP02");
        sp2.setTenSP("Chuột");
        sp2.setGia(200000);
        sp2.setSoLuong(3);

        // Hiển thị
        System.out.println("=== Sản phẩm 1 ===");
        sp1.hienThiThongTin();

        System.out.println("\n=== Sản phẩm 2 ===");
        sp2.hienThiThongTin();
    }
}