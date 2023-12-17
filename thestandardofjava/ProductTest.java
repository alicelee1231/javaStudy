class ProductTest{
    public static void main(String args[]){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println(p1.serialNo);
        System.out.println(p2.serialNo);
        System.out.println(p3.serialNo);

    }
}
class Product{
    static int count = 0; //class변수이기 때문에 값이 저장되어서 1씩 올라가는 거임. 인스턴스였으면 실행될 때마다 초기화돼서 1만 출력될거
    int serialNo;

    {
        ++count;
        serialNo = count; 
    }
    public Product(){
    }
}