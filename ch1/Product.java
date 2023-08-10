class Product{
    public static void main(String[] args){
        Product1 p1 = new Product1();
        Product1 p2 = new Product1();
        Product1 p3 = new Product1();

        System.out.println("the product no of p1 is" + p1.serialNo);
        System.out.println("the product no of p2 is" + p2.serialNo);
        System.out.println("the product no of p3 is" + p3.serialNo);
        System.out.println("the total products are " + Product1.count);


    }
}


class Product1{
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product1(){}
}

