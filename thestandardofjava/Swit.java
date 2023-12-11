import java.util.*;

class Swit{
    public static void main(String[] args){
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random()* 3) + 1;

        System.out.println("yours is" + user);
        System.out.println("com is" + com);

        switch(user - com) {
            case 2: case -1:
                System.out.println("you lose");
                break;
            case 1: case -2:
                System.out.println("you win");
                break;
            case 0 :
                System.out.println("tie");
                break;
        }    
    }
}