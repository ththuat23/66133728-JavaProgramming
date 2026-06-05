package TongHopTaiLieu.QLNV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<NhanVien> ds = new ArrayList<>();

        ds.add(new NhanVienVanPhong(
                "VP01",
                "Nguyen Van A",
                1998,
                5000000,
                2.0));

        ds.add(new NhanVienVanPhong(
                "VP02",
                "Tran Thi B",
                2001,
                4500000,
                1.8));

        ds.add(new NhanVienSanXuat(
                "SX01",
                "Le Van C",
                1997,
                1000,
                12000));

        ds.add(new NhanVienSanXuat(
                "SX02",
                "Pham Thi D",
                2002,
                900,
                10000));

        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }

        double tongLuong = 0;

        for (NhanVien nv : ds) {
            tongLuong += nv.tinhLuong();
        }

        System.out.println("\nTong luong cong ty = " + tongLuong);

        NhanVien max = ds.get(0);

        for (NhanVien nv : ds) {
            if (nv.tinhLuong() > max.tinhLuong()) {
                max = nv;
            }
        }

        System.out.println("\nNhan vien luong cao nhat:");
        System.out.println(max);

        Collections.sort(ds,
                Comparator.comparingDouble(
                        NhanVien::tinhLuong)
                        .reversed());

        System.out.println("\nDanh sach sau sap xep:");
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }

        System.out.println("\nNhan vien sinh truoc 2000:");

        for (NhanVien nv : ds) {
            if (nv.getNamSinh() < 2000) {
                System.out.println(nv);
            }
        }
    }
}