public class ConsoleBasedFizzBuzz implements FizzBuzz {
    final static int FIZZ_NUMBER = 3;
    final static int BUZZ_NUMBER = 5;

    public static void fizzBuzz(int from, int to) {

        for (int i = from; i <= to; i++) {
            if (i % FIZZ_NUMBER == 0 && i % BUZZ_NUMBER == 0) {
                System.out.println("FizzBuzz");
            } else if (i % FIZZ_NUMBER == 0) {
                System.out.println("Fizz");
            } else if (i % BUZZ_NUMBER == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    @Override
    public void print(int from, int to) {
        fizzBuzz(from, to);
    }
}
