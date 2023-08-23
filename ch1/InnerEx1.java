class InnerEx1{
    class InstatnceInner{
        int iv = 100;
        final static int CONST = 100;
    }

    static class StaticInner{
        int iv = 200;
        static int cv = 200;
    }

    void myMethod(){
        class LocalInner {
            int iv = 300;
            final static int CONST = 300;
        }
        LocalInner m = new LocalInner();
        System.out.println(m.iv);
    }

    public static void main(String args[]){
        System.out.println(InstatnceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}