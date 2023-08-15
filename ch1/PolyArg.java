class PolyArg{
    public static void main(String[] args){
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}

class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product(){}
}
class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){return "Tv";}
}

class Computer extends Product {
    Computer() {super(200);}
    public String toString(){return "Computer";}
}

class Audio extends Product{
    Audio(){super(50);}
    public String toString() {return "Audio";}
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("buget is not enough to buy it");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println("you bought the" + p);
    }
    void summary(){
        int sum = 0;
        String itemList = "";

        for(int i = 0; i<item.length; i++){
        if(item[i] ==null) break;
        sum += item[i].price;
        itemList +=(i==0) ? "" + item[i] : ", " + item[i];
    }
    System.out.println("total amount is" +  sum +"dollars");
    System.out.println("your itemList is" + itemList);
    }
}

