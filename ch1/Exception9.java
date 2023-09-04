class Exception9{
    public static void main(String args[]){
        try{
            Exception a = new Exception("this issue is occured intentionally");
            throw a;
        }catch (Exception a){
            System.out.println("error message:" + a.getMessage());
            a.printStackTrace();
        }
        System.out.println("program is ended nornally");

    } 
}