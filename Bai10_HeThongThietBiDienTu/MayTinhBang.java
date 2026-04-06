package Bai10_HeThongThietBiDienTu;

public class MayTinhBang extends ThietBiDienTu implements CoTheKetNoiInternet, CoTheCamUng {

    public MayTinhBang(String ten, double gia, String hang) {
        super(ten, gia, hang);
    }

    @Override
    public void bat() {
        System.out.println("Tablet bật");
    }

    @Override
    public void tat() {
        System.out.println("Tablet tắt");
    }

    @Override
    public void ketNoiWifi() {
        System.out.println("Tablet kết nối wifi");
    }

    @Override
    public void ngatKetNoi() {
        System.out.println("Tablet ngắt wifi");
    }

    @Override
    public void cham() {
        System.out.println("Chạm tablet");
    }

    @Override
    public void vuot() {
        System.out.println("Vuốt tablet");
    }
}