import java.util.Scanner;
class test23{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j<=n;j++){
                System.out.print("  ");
            }
        for(int z=i;z<=n;z++){
            System.out.print(i+" ");
        }
        
        System.out.println("");
        }
    }
}