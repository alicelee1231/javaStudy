class Star{
    public static void main(String[] args){
        for(int i = 1; i <=5; i++){
            for(int k = 1; k <=i; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++){
            for(int k = 1; k < 5 -i; k++){
                System.out.print(" ");
            }
            for(int p =0; p<i*2+1;p++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 4-i;k++){
                System.out.print(" ");
            }
            for(int p =0; p<=i; p++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i = 2; i<=9; i++){
        //     for(int k = 1; k<=9; k++){
        //         System.out.printf("%d x %d = %d%n", i, k, i*k);
        //     }
        // }
    }
}