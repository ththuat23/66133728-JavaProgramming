package Bai10_HeThongHinhHoc;

public class Run {
    public static void main(String[] args) {

        HinhHoc h1 = new HinhTron(0, 0, 5);
        HinhHoc h2 = new HinhVuong(2, 3, 4);
        HinhHoc h3 = new HinhTamGiac(1, 1, 3, 4, 5);

        HinhHoc[] ds = {h1, h2, h3};

        for (HinhHoc h : ds) {
            System.out.println(h);
            System.out.println("DT: " + h.tinhDienTich());
            System.out.println("CV: " + h.tinhChuVi());

            if (h instanceof CoTheDiChuyen) {
                ((CoTheDiChuyen) h).diChuyen(1, 1);
            }

            if (h instanceof CoTheQuay) {
                ((CoTheQuay) h).quay(45);
            }

            System.out.println("-------------");
        }
    }
}