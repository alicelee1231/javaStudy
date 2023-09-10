class ExceptionEx1{
    public static void main(String args[]){
        try{
            method1();
        }catch (Exception e){
            System.out.println("the exception was handled in main method");
        }
    }
    static void method1() throws Exception{
        try{
            throw new Exception();
        }catch (Exception e){
            System.out.println("the exception was handled in method1");
            throw e;
        }
    }
}