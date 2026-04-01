package QLHocSinh;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        // tạo mới 2hs, hard-code dữ liệu
        HocSinh hs1 = new HocSinh();
        String tenHS1 = "Trần Văn A";
        hs1.setTenHS(tenHS1);

        short tuoiHS1 = 14;
        hs1.setTuoiHS(tuoiHS1);

        String lopHS1 = "8A-12";
        hs1.setLopHS(lopHS1);

        HocSinh hs2 = new HocSinh("Trần Thị Tươi", (short)12, "6C");

        System.out.println(hs1.toString());
        // System.out.println(hs2.toString());

        System.out.println("Tên của hs 2 là: "+ hs2.getTenHS() );
        System.out.println("Tuổi của hs 2 là: "+ hs2.getTuoiHS() );
        System.out.println("Lớp của hs 2 là: "+ hs2.getLopHS() );


        Scanner banPhim = new Scanner(System.in);
        HocSinh hs3 = new HocSinh();

        System.out.println("Mời nhập tên của học sinh 3: ");
        String tenHS3 = banPhim.nextLine();
        hs3.setTenHS(tenHS3);
        
        System.out.println("Mời nhập tên của học sinh 3: ");
        short tuoiHS3 = banPhim.nextShort();
        hs3.setTuoiHS(tuoiHS3);

        System.out.println("Mời nhập tên của học sinh 3: ");
        String lopHS3 = banPhim.nextLine();
        hs3.setLopHS(lopHS3);
        
    }
}
