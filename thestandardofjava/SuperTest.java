class SuperTest{
    public static void main(String[] args){
        Child c = new Child();
        c.method();
    }
}

class Parent{
    int x = 10;
}

class Child extends Parent{
    int x = 20;
    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x); // 자손 클래스의 변수를 따름
        System.out.println("super.x = " + super.x); //조상 클래스의 멤버변수를 따름
    }
}