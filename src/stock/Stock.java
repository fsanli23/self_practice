package stock;

public class Stock {
    public String tickerSymbol,companyName;
    public int price,totalShares;
    public double percentChange;
    public long marketCap;


    public Stock(String tickerSymbol,String companyName,int price,int totalShares){
        this.tickerSymbol=tickerSymbol.toUpperCase();
        this.companyName=companyName;
        this.price=price;
        this.totalShares=totalShares;
        marketCap=totalShares*price;
    }


    public void adjustPrice(int value){
        price=value;


    }

    public String toString(){
        return "ticker Symbol: "+tickerSymbol+"\n"+
                "Company: "+companyName+","+" Inc."+"\n+"+
                "Current price: "+price+"("+percentChange+"%)"+"\n"+
                "Market Cap: "+"$"+marketCap;
    }




}
