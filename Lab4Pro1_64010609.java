public class Lab4Pro1_64010609 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("Symbol : "+stock.getSymbol());
        System.out.println("Name : "+stock.getName());
        System.out.println("Previous Closing Price : "+stock.getPreviousClosingPrice());
        System.out.println("Current Price : "+stock.getCurrentPrice());
        System.out.println("Percent changed : " + stock.getChangePercent()+"%");
    }
    
}
