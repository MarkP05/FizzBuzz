public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz"); // If the remainder of dividing i by 3 and 5 is zero, print FizzBuzz
            } else if (i%3 == 0) {
                System.out.println("Fizz"); // If the remainder of dividing i by 3 is zero, print Fizz
            } else if (i%5 == 0) {
                System.out.println("Buzz"); // If the remainder of dividing i by 5 is zero, print Buzz
            } else {
                System.out.println(i);
            }
        }
    }
}