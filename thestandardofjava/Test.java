import java.util.*;
class Test{
    public static void main(String[] args){
        int[] score = {100,233,45,3333,555};
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i]+",");
    }System.out.println();
    System.out.println(Arrays.toString(score));


    char[] abc = {'a','c','d','e'};
    char[] def = {'0','1','2','3','4','5'};
    char[] result = new char[abc.length + def.length];
    System.out.println(result);
    System.arraycopy(abc,0,def,0, abc.length);
        }
}