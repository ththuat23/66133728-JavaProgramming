package TongHopTaiLieu.QLPhuongTien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<PhuongTien> ds = new ArrayList<>();

        ds.add(new XeMay(
                "XM01",
                "Wave Alpha",
                "Honda",
                110));

        ds.add(new XeMay(
                "XM02",
                "Exciter",
                "Yamaha",
                150));

        ds.add(new OTo(
                "OT01",
                "Vios",
                "Toyota",
                5));

        ds.add(new OTo(
                "OT02",
                "City",
                "Honda",
                5));

        System.out.println("=== DANH SACH PHUONG TIEN ===");

        for (PhuongTien pt : ds) {
            System.out.println(pt);
        }

        double tongPhi = 0;

        for (PhuongTien pt : ds) {
            tongPhi += pt.tinhPhiBaoTri();
        }

        System.out.println("\nTong phi bao tri = "
                + tongPhi);

        PhuongTien max = ds.get(0);

        for (PhuongTien pt : ds) {
            if (pt.tinhPhiBaoTri()
                    > max.tinhPhiBaoTri()) {

                max = pt;
            }
        }

        System.out.println("\nPhi bao tri lon nhat:");
        System.out.println(max);

        Collections.sort(ds,
                Comparator.comparingDouble(
                        PhuongTien::tinhPhiBaoTri)
                        .reversed());

        System.out.println("\nDanh sach sau sap xep:");

        for (PhuongTien pt : ds) {
            System.out.println(pt);
        }

        System.out.println(
                "\nPhuong tien hang Honda:");

        for (PhuongTien pt : ds) {
            if (pt.getHangSX()
                    .equalsIgnoreCase("Honda")) {

                System.out.println(pt);
            }
        }
    }
}