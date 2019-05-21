class Box {
    double width;
    double height;
    double depth;
}

class BoxDemo {
    public static void main(String args[]) {
         Box mybox = new Box();
         mybox.width = 10;
         mybox.height = 20;
         mybox.depth = 15;

         int vol = (int) (mybox.width * mybox.height * mybox.depth);
         System.out.println("Объем параллелепипеда равен " + vol);
    }
}