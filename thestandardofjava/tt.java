
class tt{
    public static void main(String[] args){
        Test test = new Test("dd");
        System.out.println(test);
    }
}

class Test{
    // static int haha = 3;
    String num;
    Test(String num){
        this.num = num;
    }


    public String toString(){
        return "here:" + this.num; //toString이 있기 때문에 system.out했을 때 우리가 읽을 수 있는 값이 나옴
    }
}