class Draw{
    public static void main(String args[]){
        Point[] p = {
            new Point(100, 200),
            new Point(140,50),
            new Point(200,330)
        };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,122),50);

        t.draw();
        c.draw();
    }
}

class Shape{
    String color = "black";
    void draw(){
        System.out.printf("[color=%s]%n", color);
    }
}
class Point{
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(){
        this(0,0);
    }
    String getXY() {
        return "("+x+"," +y + ")";
    }
}

class Circle extends Shape{ //shape는 동그라미이다 -> 상속
    Point center; //동그라미는 point를 가지고 있다 -> 포함관계
    int r;

    Circle(){
        this(new Point(0,0),100);
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw(){
        System.out.printf("[center=(%d,%d), r=%d, color=%s]%n",center.x,center.y,r,color);
    }//오버라이딩이 되어서 조상 클래스에 동일한 메서드가 있어도 자식 클래스에 있는 메소드가 쓰임
}

class Triangle extends Shape{
    Point[] p = new Point[3];

    Triangle(Point[] p){
        this.p = p;
    }
    void draw(){
        System.out.printf("[p1=%s,p2=%s,p3=%s,color=%s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
    }
}