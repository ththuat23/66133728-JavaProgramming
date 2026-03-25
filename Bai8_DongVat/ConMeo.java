package Bai8_DongVat;
// Lớp con: Mèo
// File: ConMeo.java
public class ConMeo extends DongVat {
    private String mauLong;
    private boolean thichLeoTree;
    
    public ConMeo(String ten, int tuoi, double canNang, 
                  String mauLong, boolean thichLeoTree) {
        super(ten, tuoi, canNang);
        this.mauLong = mauLong;
        this.thichLeoTree = thichLeoTree;
    }
    
    // Phương thức riêng
    public void batChuot() {
        System.out.println(ten + " đang rình bắt chuột...");
    }
    
    public void keu() {
        System.out.println(ten + " kêu: Meo meo!");
    }
    
    // Ghi đè phương thức ăn - mèo ăn khác chó
    @Override
    public void an() {
        System.out.println(ten + " đang ăn cá một cách nhẹ nhàng...");
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Màu lông: " + mauLong);
        System.out.println("Thích leo trèo: " + (thichLeoTree ? "Có" : "Không"));
    }
}