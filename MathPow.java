import java.util.Scanner;

class MathPow {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� �����");
        int a = scanner.nextInt();
        System.out.println("������� �������");
        int b = scanner.nextInt();

        int c =(int) (Math.pow(a, b));
        System.out.println(c);
    }
}