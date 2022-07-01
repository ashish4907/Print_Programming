class test8{
    public static void main(String[] args){
        int sum = 1;
        for(int i=1;i<=5;i++){
            for(int j=1; j<=5;j++){

               if(sum==10){
                   sum = 1;
               }
                System.out.print(sum+" ");
                sum++;

                }
            System.out.println(" ");
        }
    }
}