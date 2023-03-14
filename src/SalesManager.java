public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int trimmed_mean() {
        int min = this.min();
        int max = this.max();
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        sum = sum - min - max;

        return sum / (sales.length - 2);
    }
}