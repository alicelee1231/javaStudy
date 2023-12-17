class BlockTest{
    static {
        System.out.println("static { } "); //class 초기화 블럭 -> 처음 메모리에 로딩될 때만 실행
    }
    {
        System.out.println("{ }"); //인스턴스 초기화 블럭은 실행될 떄마다 수행
    }
    public BlockTest(){
        System.out.println("생성자");
    }

    public static void main(String args[]){
        System.out.println("BlockTest bt = new BlockTest(); ");
        BlockTest bt = new BlockTest();
        System.out.println("next");
        System.out.println("BlockTest bt2 = new BlockTest(); ");
        BlockTest bt2 = new BlockTest();
    }



}
