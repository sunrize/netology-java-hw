public class Main {
    public static void main(String[] args) {
        long[] sales = {100,200,300,2000,400,200};
        SalesManager manager = new SalesManager(sales);

        System.out.println(manager.max());
        System.out.println(manager.trimmed_mean());
    }
}