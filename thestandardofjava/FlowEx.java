import java.util.*;

class FlowEx{
    public static void main(String[] args){
        int num = 0, sum = 0;
        System.out.print("please enter the number > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while(num!=0){
            sum += num % 10;
            System.out.printf("sum=%d num=%d%n", sum, num);
            num /=10;
        }
        System.out.println("the total is:" +sum);
    }
}