class Array10{
    public static void main(String[] args){
        int[][] score ={
                    {100,200,300}
                    ,{20,10,30}
                    ,{33,44,55}
                    ,{55,66,77}
        };
        int sum = 0;
        for(int i =0; i< score.length; i++){
            for(int j =0; j <score[i].length; j++){
                System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
            }
        }
        for(int[]tmp:score){
            for(int i : tmp){
                sum+=i;
            }
        }
        System.out.println("sum ="+sum);
    }
}