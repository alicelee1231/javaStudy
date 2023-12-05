class Operator{
    public static void main (String[] args){
        int i = 5, s = 5;
        System.out.println(i++);
        System.out.println(++s);

        int x = 5;
        System.out.println(x++);
        System.out.println(++x);

        int y = x++ - ++x;
        System.out.println(y);
    }
}