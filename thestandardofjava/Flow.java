import java.util.*;

class Flow{
    public static void main(String[] args){
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.println("점수를 입력해 주세요. >");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("your score is %d. %n", score);
        int oopt = score % 10;
        System.out.println(oopt);

        // if(score >= 90){
        //     grade = 'A';
        //     if(score >= 98){
        //         opt = '+';
        //     }else {
        //         opt = '-';
        //     }
        // }else if (score >= 80){
        //     grade = 'B';
        //     if(score >= 88){
        //         opt ='+';
        //     }else {
        //         opt ='-';
        //     }
        // }else {
        //     grade = 'C';
        // }
        // System.out.printf("your score is %c%c. %n", grade, opt);
            if(oopt >= 8){
                opt = '+';
            }else {
                opt = '-';
            }
            if(score >= 90){
                grade = 'A';
            }else if(score >= 80){
                grade = 'B';
            }
            System.out.printf("your score is %c%c. %n", grade,opt);
    }
}

