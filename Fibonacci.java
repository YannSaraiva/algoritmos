public class Fibonacci {
  public static int fibonacci(int n) {
    int a = 0, b = 1;

    for (int i = 2; i <= n; i++) {
      int temp = a + b;
      a = b;
      b = temp;
    }

    return b;
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(6));
  }
}
