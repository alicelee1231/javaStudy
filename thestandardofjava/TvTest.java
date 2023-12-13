    class TvTest {
    public static void main(String[] args){
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("the channel of t1 is" + t1.channel);
        System.out.println("the channel of t2 is" + t2.channel);

        t2 = t1;
        t1.channel = 7 ;
        System.out.println("the channel of t1 is changed" );
        System.out.println("the channel of t1 is " + t1.channel);
        System.out.println("the channel of t2 is " + t2.channel);

    }

    }
class Tv {
        String color;
        boolean power;
        int channel;

        void power(){power = !power;}
        void channelUp(){++channel;}
        void channelDown(){--channel;}
    }
