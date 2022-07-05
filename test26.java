import java.util.Scanner;
class test26{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
        for(int z=1;z<=i;z++){
            System.out.print(z+" ");
        }
        
        System.out.println("");
        }
    }
}