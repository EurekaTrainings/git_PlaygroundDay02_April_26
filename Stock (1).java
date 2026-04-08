import java.math.BigDecimal;
import java.util.Objects;

public class Stock {
    private String tickerSymbol;
    private String tickerName;
    private int marketCap;
    private int zipcode;
    private String city;
    private String state;


    public Stock(String tickerSymbol,
                 String tickerName,
                 int marketCap,
                 ) {
        this.tickerSymbol = tickerSymbol;
        this.tickerName = tickerName;
        this.marketCap = marketCap;
    }

    boolean hasGoodFundamentals() {
        boolean bool = this.currentRatio > 10;
        return bool;
    }

    void print() {
        System.out.println("Ticker Symbol: " + tickerSymbol);
        System.out.println("Ticker Name: " + tickerName);
        System.out.println("Market Cap: " + marketCap);
         System.out.println("Zipcode is: " + zipcode);
         System.out.println("City is: " + city);
        System.out.println("Zipcode is : "+ zipcode);
        System.out.println("State is: " + state);
    }

}
