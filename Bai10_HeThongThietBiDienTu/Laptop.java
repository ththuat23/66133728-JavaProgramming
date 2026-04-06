package Bai10_HeThongThietBiDienTu;

public class Laptop extends ThietBiDienTu implements CoTheKetNoiInternet {

    public Laptop(String ten, double gia, String hang) {
        super(ten, gia, hang);
    }

    @Override
    public void bat() {
        System.out.println("Laptop bật");
    }

    @Override
    public void tat() {
        System.out.println("Laptop tắt");
    }

    @Override
    public void ketNoiWifi() {
        System.out.println("Laptop kết nối wifi");
    }

    @Override
    public void ngatKetNoi() {
        System.out.println("Laptop ngắt wifi");
    }
}