package Bai10_HeThongThietBiDienTu;

public class DienThoaiThongMinh extends ThietBiDienTu implements CoTheKetNoiInternet, CoTheCamUng {

    public DienThoaiThongMinh(String ten, double gia, String hang) {
        super(ten, gia, hang);
    }

    @Override
    public void bat() {
        System.out.println("Điện thoại bật");
    }

    @Override
    public void tat() {
        System.out.println("Điện thoại tắt");
    }

    @Override
    public void ketNoiWifi() {
        System.out.println("Kết nối wifi");
    }

    @Override
    public void ngatKetNoi() {
        System.out.println("Ngắt wifi");
    }

    @Override
    public void cham() {
        System.out.println("Chạm màn hình");
    }

    @Override
    public void vuot() {
        System.out.println("Vuốt màn hình");
    }
}