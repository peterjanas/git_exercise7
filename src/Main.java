

public class Main {
    public static void main(String[] args) {

        printNumber(1, 10);

       printNumbers();

    }

    public static void printNumbers() {
        for (int i = 1; i < 200; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BuzzFizz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz!");

            } else {
                System.out.println(i);
            }

        }
    }

    public static void printNumber(int start, int end) {
        for (int i = start; i < end+1; i++) {
            System.out.println(i);
        }
    }
}