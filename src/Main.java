public class Main {
    public static void main(String[] args) {
        long[] sales = {100,200,300};
        SalesManager manager = new SalesManager(sales);

        System.out.println(manager.max());
    }
}