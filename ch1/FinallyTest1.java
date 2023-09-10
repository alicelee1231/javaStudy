class FinallyTest1{
    public static void main(String args[]){
        FinallyTest1.method1();
        System.out.println("After finighing methon1(), back to main method");
    }
    static void method1(){
        try{
            System.out.println("method1() is alramed");
            return;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("the finally block of method1() is implemented");
        }
    }
}