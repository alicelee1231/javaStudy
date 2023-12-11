class FlowEx2{
    public static void main(String[] args){
        Loop1 : for(int i =2; i <=9; i++){
            for(int k =1; k <=9; k++){
                if(k==5)
                break Loop1;
                System.out.println(i+"*"+k+"="+i*k);
            }
            System.out.println();
        }
    }
}