public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long trimmed_mean() {
        long min = this.min();
        long max = this.max();
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        sum = sum - min - max;

        return sum / (sales.length - 2);
    }
}