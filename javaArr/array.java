
class array{
    public static void main(String [] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100,99,100,90,103};
        
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("total score : " + sum);
        System.out.println("average score : " + average);
    
}
}
