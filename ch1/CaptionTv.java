
class CaptionTv{
    public static void main(String[] args){
        CaptionTv1 ctv = new CaptionTv1();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello java");
        ctv.caption = true;
        ctv.displayCaption("Hello. sam");
    }
}
class Tv{
    boolean power;
    int channel;

    void power(){power= !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class CaptionTv1 extends Tv{
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}

