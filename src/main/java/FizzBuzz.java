public class FizzBuzz {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) {
            System.out.println(runFizzBuzz(x));
        }
    }

    public static Object runFizzBuzz(int number) {
        if (isDivisibleBy(number, 15)) {
            return "FizzBuzz";
        } else if (isDivisibleBy(number, 3)) {
            return "Fizz";
        } else if (isDivisibleBy(number, 5)) {
            return "Buzz";
        } else {
            return number;
        }
    }

    private static boolean isDivisibleBy(int number, int divisor) {
        return (number % divisor) == 0;
    }
}
