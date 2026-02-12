package week03.invoice;

public class Invoice {

    private String partNo;
    private String desc;
    private int qty;
    private double price;

    public Invoice(String partNo, String desc, int qty, double price) {
        this.partNo = partNo;
        this.desc = desc;
        this.qty = qty;
        this.price = price;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


