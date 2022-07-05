import java.util.Scanner;
class test29{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
        for(int z=i;z>=1;z--){
            System.out.print(z+" ");
        }
        
        System.out.println("");
        }
    }
}