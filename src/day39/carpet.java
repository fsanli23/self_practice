package day39;

public class carpet {
    public double widthn, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double widthn, double length, double unitPrice, boolean isPersian) {


        this.widthn = widthn;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calCost() {
        double totalPrice = (widthn * length) * unitPrice;
        if (isPersian) {
            totalPrice += 200;

        }
        return totalPrice;
    }


    @Override
    public String toString() {
        return "carpet{" +
                "widthn=" + widthn +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian + "total price:"+calCost()+
                '}';
    }






}
