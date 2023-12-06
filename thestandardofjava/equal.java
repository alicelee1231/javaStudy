// class equal{
//     public static void main(String[] args){
//         String str1 = "abc";
//         String str2 = new String("abc");
//         System.out.println(str1.equals(str2));
//     }
// } 

import java.util.*;
class equal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("please enter a one word.>"); 

        String input = scanner.nextLine();

        ch = input.charAt(0);

        if('0' <= ch && ch <= '9'){
            System.out.printf("the word you entered is number. %n");
        }
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("the word you entered is English. %n");
        }
    }
}