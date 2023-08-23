public class Main {
    public static void main(String[] args) {
        Mymath instance1 = new Mymath(5, 10);
        System.out.println("Instance 1 addition: " + instance1.add());

        System.out.println("Static method addition: " + Mymath.add(15,20));
    }
}


class Mymath{
    long a,b;

    Mymath(int a, int b){
        this.a = a;
        this.b = b;
    }
    long add(){
        return a + b;
    }

    static long add(long a, long b){
        return a + b;
    }
}