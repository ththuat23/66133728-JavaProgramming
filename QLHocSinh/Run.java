package QLHocSinh;

import java.util.ArrayList;
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


        // tạo học sinh 3, nhập thông tin từ bàn phím
        Scanner banPhim = new Scanner(System.in);
        HocSinh hs3 = new HocSinh();

        System.out.println("Mời nhập tên của học sinh 3: ");
        String tenHS3 = banPhim.nextLine();
        hs3.setTenHS(tenHS3);
        
        System.out.println("Mời nhập tuổi của học sinh 3: ");
        short tuoiHS3 = banPhim.nextShort();
        hs3.setTuoiHS(tuoiHS3);
        banPhim.nextLine(); //Thêm dòng này để nhập được lớp

        System.out.println("Mời nhập lớp của học sinh 3: ");
        String lopHS3 = banPhim.nextLine();
        hs3.setLopHS(lopHS3);

        System.out.println(hs3.toString());

        // Tạo danh sách N học sinh, nhập dữ liệu vào từ bàn phím
        // từ đây mới có danh sách học sinh, từ trước là không có ai trong list dsHocSinh
        ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
        System.out.println("Mời nhập số lượng N học sinh: ");
        int N = banPhim.nextInt();
        banPhim.nextLine();

        for (int i=0; i<N; i++ ){
            HocSinh hsi = new HocSinh();
            System.out.println("Mời nhập tên của học sinh: "+ i);
            String tenHSi = banPhim.nextLine();
            hsi.setTenHS(tenHSi);
            
            System.out.println("Mời nhập tuổi của học sinh: "+ i);
            short tuoiHSi = banPhim.nextShort();
            hsi.setTuoiHS(tuoiHSi);
            banPhim.nextLine(); //Thêm dòng này để nhập được lớp

            System.out.println("Mời nhập lớp của học sinh: "+ i);
            String lopHSi = banPhim.nextLine();
            hsi.setLopHS(lopHSi);
            
            dsHocSinh.add(hsi);
        }

        for (int i=0; i<N; i++){
            System.out.println(dsHocSinh.get(i).toString());
        }

        //4a=================================
        // nhập học sinh thêm từ bàn phím
        HocSinh hsThem = new HocSinh();
            System.out.println("Mời nhập tên của học sinh thêm: ");
            String tenHSThem = banPhim.nextLine();
            hsThem.setTenHS(tenHSThem);
            
            System.out.println("Mời nhập tuổi của học sinh thêm: ");
            short tuoiHSThem = banPhim.nextShort();
            hsThem.setTuoiHS(tuoiHSThem);
            banPhim.nextLine(); //Thêm dòng này để nhập được lớp

            System.out.println("Mời nhập lớp của học sinh thêm: ");
            String lopHSThem = banPhim.nextLine();
            hsThem.setLopHS(lopHSThem);
        //Thêm vào ds
        dsHocSinh.add(hsThem);
        //xuất học sinh
        System.out.println(hsThem.toString());

        // in ra
        for (int i=0; i<dsHocSinh.size(); i++){
            System.out.println(dsHocSinh.get(i).toString());
        }

        //5a======================
        // tìm và xóa học sinh tên Hoa trong ds
        for (int i=0; i<N; i++ ){
            HocSinh hsTim = dsHocSinh.get(i);
            if (hsTim.getTenHS().equals("Hoa")) {
                dsHocSinh.remove(hsTim);
                break;
            }
        }
        
        System.out.println("Sau cùng, danh sách học sinh là: ");
        // in ra lại danh sách học sinh
        for (int i=0; i<dsHocSinh.size(); i++){
            System.out.println(dsHocSinh.get(i).toString());
        }

        banPhim.close();
    }
}
