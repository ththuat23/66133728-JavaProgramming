package Bai8_DongVat;
// Lớp con: Chó
// File: ConCho.java
public class ConCho extends DongVat {
    // Thuộc tính riêng của Chó
    private String giongCho;
    private boolean coTheTruongNha;
    
    // Constructor của lớp con phải gọi constructor của lớp cha
    public ConCho(String ten, int tuoi, double canNang, 
                  String giongCho, boolean coTheTruongNha) {
        super(ten, tuoi, canNang);  // Gọi constructor của DongVat
        this.giongCho = giongCho;
        this.coTheTruongNha = coTheTruongNha;
    }
    
    // Phương thức riêng của Chó
    public void sua() {
        System.out.println(ten + " đang sủa: Gâu gâu!");
    }
    
    public void duoiMeo() {
        System.out.println(ten + " đang đuổi mèo...");
    }
    
    // Ghi đè phương thức của lớp cha
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();  // Gọi phương thức của lớp cha
        System.out.println("Giống chó: " + giongCho);
        System.out.println("Có thể trông nhà: " + (coTheTruongNha ? "Có" : "Không"));
    }
}