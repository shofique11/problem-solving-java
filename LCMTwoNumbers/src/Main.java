import java.util.Scanner;

public class Main {
  public static int gcd(int a, int b) {
      return b == 0 ? a : gcd(b, a % b);
  }
  public static int lcm(int a, int b) {
      return a * b / gcd(a, b);
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int result = lcm(a, b);
        System.out.println(result);
    }
}