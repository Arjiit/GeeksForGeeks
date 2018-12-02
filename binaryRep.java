public class DecimalBinaryExample{
 
  public void convertBinary(int num){
     int binary[] = new int[40];
     int index = 0, count =0;
     while(num > 0){
       binary[index++] = num%2;
       if(num%2==1) count++;
       num = num/2;
     }
     for(int i = index-1;i >= 0;i--){
       System.out.print(binary[i]);
     }
    System.out.println();
      System.out.println(count);
  }
 
  public static void main(String a[]){
     DecimalBinaryExample obj = new DecimalBinaryExample();
     System.out.println("Binary representation of 25: ");
     obj.convertBinary(25);
     System.out.println("\nBinary representation of 45: ");
     obj.convertBinary(45);
     System.out.println("\nBinary representation of 999: ");
     obj.convertBinary(999);
  }
}
