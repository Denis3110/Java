import java.util.Scanner;

class Box {
    int width;
    int height;
    int depth;
    int vol;
}

class BoxScanner {
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
   
         Box mybox = new Box();

         System.out.println("������� ������ ���������������");
         mybox.width = scanner.nextInt();
         System.out.println("������� ������ ���������������");
         mybox.height = scanner.nextInt();
         System.out.println("������� ������� ���������������");
         mybox.depth = scanner.nextInt();

	 int vol = mybox.width * mybox.height * mybox.depth;

         System.out.printf("����� ����� %d %s", vol, "Example"); 
    }
}