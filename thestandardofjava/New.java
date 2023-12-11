class New{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        for(int tmp : arr){
            System.out.println(tmp);
        }
    
    int i =11;
    System.out.println("start to countdown");
    while(--i!=0){
        System.out.println(i);
        for(int k =0; k <2_000_000_000; k++){
            ;
        }
    }
    System.out.println("Game over");
    }
}