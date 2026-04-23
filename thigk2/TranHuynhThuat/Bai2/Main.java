package thigk2.TranHuynhThuat.Bai2;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

/*
Tóm tắt cách giải:
- Tạo lớp SinhVien gồm 4 thuộc tính
- Hard-code 3 sinh viên vào ArrayList
- Nhập thêm 1 sinh viên từ bàn phím
- In danh sách sinh viên
- In danh sách sinh viên có tuổi lớn hơn 20
*/

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner banPhim = new Scanner(System.in);

        int namHienTai = LocalDate.now().getYear();

        // Hard-code 3 sinh viên
        ds.add(new SinhVien("SV01", "Nguyen Van A", 2002, 8.5));
        ds.add(new SinhVien("SV02", "Tran Thi B", 2005, 7.8));
        ds.add(new SinhVien("SV03", "Le Van C", 2001, 9.0));

        System.out.println("=== Danh sách 3 sinh viên ban đầu ===");
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }

        // Nhập thêm 1 sinh viên
        System.out.println("\n=== Nhập thêm sinh viên mới ===");

        System.out.print("Nhập mã SV: ");
        String maSV = banPhim.nextLine();

        System.out.print("Nhập họ tên: ");
        String hoTen = banPhim.nextLine();

        System.out.print("Nhập năm sinh: ");
        int namSinh = banPhim.nextInt();

        System.out.print("Nhập điểm trung bình: ");
        double diemTB = banPhim.nextDouble();

        SinhVien svMoi = new SinhVien(maSV, hoTen, namSinh, diemTB);
        ds.add(svMoi);

        banPhim.close();
    }
}