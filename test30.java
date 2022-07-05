import java.util.Scanner;
class test30{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
        for(int z=1;z<=2*i-1;z++){
            System.out.print((char)(z+64)+" ");
        }
        
        System.out.println("");
        }
    }
}