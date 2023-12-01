class EqualEx1 {
    public static void main(String []args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1 and v2 have same values");
        else 
            System.out.println("they have a differnet value");

        v2 = v1;
        if (v1.equals(v2))
            System.out.println("v1 and v2 have a same vlueu");
        else 
            System.out.println("not same");
    }
}
class Value {
    int value;
    Value(int value){
        this.value = value;
    }
}