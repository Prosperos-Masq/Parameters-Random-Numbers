

public class fibonacci {
	
    public static void main(String[] args) {
        System.out.println("This program lists the fibonacci sequence.");
        int fib0 = 0;
        int fib1 = 1;

        while (fib0 < 10000) {
            System.out.println(fib0);
            int fib3 = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib3;
        }
    }

}