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

         System.out.println("¬ведите ширину параллелепипеда");
         mybox.width = scanner.nextInt();
         System.out.println("¬ведите высоту параллелепипеда");
         mybox.height = scanner.nextInt();
         System.out.println("¬ведите глубину параллелепипеда");
         mybox.depth = scanner.nextInt();

	 int vol = mybox.width * mybox.height * mybox.depth;

         System.out.printf("ќбъем равен %d %s", vol, "Example"); 
    }
}