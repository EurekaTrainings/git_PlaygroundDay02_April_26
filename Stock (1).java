import java.math.BigDecimal;
import java.util.Objects;

public class Stock {
    private String tickerSymbol;
    private String tickerName;
    private int marketCap;
    private int zipCode;
    private string city;

    private int Zipcode;

    public Stock(String tickerSymbol,
                 String tickerName,
                 int marketCap
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
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Zipcode is : "+ Zipcode);
        System.out.println("Zip Code is "+zipCode);
        system.out.println("city is" + city);
    }

}
