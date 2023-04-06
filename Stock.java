public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(){
    }

    Stock (String newsymbol,String newname){
        symbol = newsymbol;
        name = newname;
    }

    public String getSymbol(){
        return symbol;
    }
    
    public String getName(){
        return name;
    } 

    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getChangePercent(){
        double changePricePercent = (currentPrice-previousClosingPrice)/previousClosingPrice*100;
        return changePricePercent;
    }

}
