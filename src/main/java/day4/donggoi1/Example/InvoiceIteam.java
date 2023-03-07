package day4.donggoi1.Example;

public class InvoiceIteam {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceIteam(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

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

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getTotal(){
        return  unitPrice*qty;
    }

    @Override
    public String toString() {
        return "InvoiceIteam[" +
                "id=" + id +
                ", desc=" + desc +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ']';
    }

}
