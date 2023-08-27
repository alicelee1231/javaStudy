public class Player{
    public static void main(String[] args){
        Player1 ap = new AudioPlayer();//다형성
        ap.play(100);
        ap.stop();
    }
}
abstract class Player1{ //추상 클래스(미완성 클래스)
    abstract void play(int pos);//추상 메서드
    abstract void stop();
}

class AudioPlayer extends Player1 {
    void play(int pos){System.out.println(pos);}
    void stop() {System.out.println("it will be stopped");}
}

