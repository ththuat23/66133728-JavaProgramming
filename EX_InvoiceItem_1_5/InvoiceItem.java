package EX_InvoiceItem_1_5;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Tổng tiền
    public double getTotal() {
        return unitPrice * qty;
    }

    // Hiển thị thông tin
    public String toString() {
        return "InvoiceItem[id=" + id +
               ",desc=" + desc +
               ",qty=" + qty +
               ",unitPrice=" + unitPrice + "]";
    }
}