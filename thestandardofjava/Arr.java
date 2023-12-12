class Arr{
    public static void main(String[] args){
        int[] score = {79,33,4,22,431,234};
        int max = score[0];
        int min = score[0];

        for(int i = 1; i < score.length; i++){
            if(score[i] > max){
                max = score[i];
            }else if(score[i] < min){
                min = score[i];
            }
        }
        System.out.println("max :" + max);
        System.out.println("min :" + min);
    }
}