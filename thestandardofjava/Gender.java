import java.util.*;

class Gender{
    public static void main(String[] args){
        System.out.print("please enter your id number >");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(6);

        switch(gender) {
            case '1': case '3':
                System.out.println("you are a male");
                break;
            case '2': case '4':
                System.out.println("you are a female");
                break;
            default:
                System.out.println("it is not vaild number");
        }
    }
}