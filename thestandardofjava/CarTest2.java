class CarTest2{
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("blue");
        // Car c3 = new Car("black","ddd");

        System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door);
        // System.out.println(c3.color + ", " + c3.gearType + ", " + c3.door);

    }
}

class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white","auto",4);
    }

    Car(String color){
        this(color,"not auto",4);
    }

    Car(String color, String gearType, int door){
        this.color = color; //this붙은 color는 인스턴스변수, 뒤의 color는 지역변수
        this.gearType = gearType;
        this.door = door;
    }
}