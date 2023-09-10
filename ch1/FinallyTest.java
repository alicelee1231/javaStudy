class FinallyTest{
    public static void main(String args[]){
        try{
            startInstall();
            copyFile();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            deleteTempFiles();
        }
    }
    static void startInstall(){
    }
    static void copyFile();
    static void deleteTempFiles();
}