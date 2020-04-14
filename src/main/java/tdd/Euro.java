package tdd;

public class Euro {
    private int amount;

    private static final double CENTS_PER_EURO = 100;

    public Euro(double amount) {
        this.amount = (int) (amount * CENTS_PER_EURO);
    }

    @Override
    public String toString() {
        return String.format("EUR %.2f", (double) amount / CENTS_PER_EURO);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Euro) && amount == ((Euro) o).amount;
    }

    public Euro minus(Euro subtrahend) {
        Euro result = new Euro(0);
        result.amount = amount - subtrahend.amount;
        return result;
    }
}
