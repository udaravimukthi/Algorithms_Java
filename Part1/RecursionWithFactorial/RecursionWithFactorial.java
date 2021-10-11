public class RecursionWithFactorial {

    public static void main(String[] args) {
        int number = 4;
        int fact = factorial(number);
        System.out.println("The Factorial of" + number + "is" + fact);
    }

    static int factorial(int n) {
        if (n == 0)
            return 1; // factorial of 0 is 1
        else
            return (n * factorial(n - 1)); // 4* 3*2
    }
}