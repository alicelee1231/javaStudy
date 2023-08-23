class Car{
    public static void main(String[]args){
        Car1 c = new Car1();
        System.out.println("Color:" +c.gearType);
    }
}

class Car1{
    String color;
    String gearType;

    Car1(){
        this("white","auto");
    }
    Car1(String color){
        this(color,"auto");
    }
    Car1(String color, String gearType){
        this.color = color;
        this.gearType = gearType;
    }
    
}
