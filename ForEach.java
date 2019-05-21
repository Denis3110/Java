class ForEach {
    public static void main(String args[]) {
         int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 int sum = 0;

	 for(int a : nums) {
	       System.out.println("Значение a равно " + a);
               sum += a;
               if(a == 4) break;
         }
         System.out.println("Сумма равна " + sum);
    }
}
