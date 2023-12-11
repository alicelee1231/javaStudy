class Star{
    public static void main(String[] args){
        for(int i = 1; i <=5; i++){
            for(int k = 1; k <=i; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 2; i<=9; i++){
            for(int k = 1; k<=9; k++){
                System.out.printf("%d x %d = %d%n", i, k, i*k);
            }
        }
    }
}