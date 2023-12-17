class Mymath{
    public static void main(String args[]){
        
        System.out.println("cd"+Mymath2.add(1L,2L));//class method는 instance생성없이도 호출가능

        Mymath2 m2 = new Mymath2(); // instance method는 인스턴스를 생성한 후 호출 가능
        m2.a = 200l;
        m2.b = 300l; 
        System.out.println("instatnce" + m2.add());
        System.out.println(m2.subtract());
    }
}

class Mymath2{
    long a, b ;
    long add(){ return a + b;}
    long subtract() {return a - b;}

    static long add(long c,long d){return c+d;}
}
