

class CarTest2{
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("C1의 color = " + c1.color +", gearType ="+ c1.gearType +", door=" +c1.door);
        System.out.println("C2의 color = " + c2.color +", gearType ="+ c2.gearType +", door=" +c2.door);

    }
}
class Car{
    String color;
    String gearType;
    int door;


Car(){
    this("black","auto",4);
}

Car(String color){
    this(color,"auto",5);
}

Car(String color, String gearType, int door){
    this.color = color;
    this.gearType = gearType;
    this.door = door;
}
}