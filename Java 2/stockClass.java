/******************************************************************************

stockClass
Khanon Curtis
5/6/25

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.closingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.printf("%s %s price-change percentage: %.2f%%", stock.symbol, stock.name, stock.changePercent());
    }
}

class Stock {
    String symbol;
    String name;
    double closingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    double changePercent() {
        return Math.abs((currentPrice - closingPrice) / closingPrice) * 100;
    }
}
