import java.util.Scanner;
class test33{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
        for(int z=2*i-1;z>=1;z--){
            System.out.print("*"+" ");
        }
        
        System.out.println("");
        }
    }
}