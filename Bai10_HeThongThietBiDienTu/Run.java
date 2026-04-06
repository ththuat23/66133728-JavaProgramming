package Bai10_HeThongThietBiDienTu;

public class Run {
    public static void main(String[] args) {

        DienThoaiThongMinh dt = new DienThoaiThongMinh("iPhone", 2000, "Apple");

        System.out.println(dt); // dùng toString()

        dt.bat();
        dt.ketNoiWifi();
        dt.vuot();
    }
}