class test20{
    public static void main(String[] args){
        int k = 97;
     for(int i=1;i<=5;i++){
            for(int j=1; j<=i;j++){
                System.out.print((char)k+" ");
                k++;
            }
            System.out.println(" ");
        }
    }
}