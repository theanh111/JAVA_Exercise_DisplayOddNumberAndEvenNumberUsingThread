public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddNumber = new OddThread();
        EvenThread evenNumber = new EvenThread();

        oddNumber.start();
        oddNumber.join();

        System.out.println();
        System.out.println("=== Main Thread === ");
        System.out.println();

        evenNumber.start();
    }
}
