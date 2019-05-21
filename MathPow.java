import java.util.Scanner;

class MathPow {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите число");
        int a = scanner.nextInt();
        System.out.println("¬ведите степень");
        int b = scanner.nextInt();

        int c =(int) (Math.pow(a, b));
        System.out.println(c);
    }
}