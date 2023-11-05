package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double dollarQuantity) {
        return (dollarQuantity + (dollarQuantity * IOF)) * dollarPrice;
    }

}
