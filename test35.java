
import java.util.Scanner;
class test35{
    public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=in.nextInt();
 
    for(int i=1;i<=n;i++) {
      for(int j=i;j<=n-1;j++) {
        System.out.print("  ");
      }
      for(int j=i;j>=1;j--) {
        System.out.print(j%2+" ");
      }
      for(int j=2;j<=i;j++) {
        System.out.print(j%2+" ");
      }
      System.out.println( );
    }
  }
}
