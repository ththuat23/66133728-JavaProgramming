package Bai10_HeThongNhanVien;

public class Run {
    public static void main(String[] args) {

        NhanVien nv1 = new NhanVienVanPhong("NV01", "An", 5000000, 26);
        NhanVien nv2 = new NhanVienKinhDoanh("NV02", "Bình", 4000000, 120000000);
        NhanVien nv3 = new QuanLy("NV03", "Cường", 7000000, 2.5);

        NhanVien[] ds = {nv1, nv2, nv3};

        for (NhanVien nv : ds) {
            System.out.println(nv);

            CoTheTinhLuong tl = (CoTheTinhLuong) nv;
            CoTheXepLoai xl = (CoTheXepLoai) nv;

            System.out.println("Lương: " + tl.tinhLuong());
            System.out.println("Xếp loại: " + xl.xepLoai());

            // ép kiểu để gọi thưởng
            if (nv instanceof NhanVienVanPhong) {
                System.out.println("Thưởng: " +
                        ((NhanVienVanPhong) nv).tinhThuong());
            } else if (nv instanceof NhanVienKinhDoanh) {
                System.out.println("Thưởng: " +
                        ((NhanVienKinhDoanh) nv).tinhThuong());
            } else if (nv instanceof QuanLy) {
                System.out.println("Thưởng: " +
                        ((QuanLy) nv).tinhThuong());
            }

            System.out.println("----------------------");
        }
    }
}