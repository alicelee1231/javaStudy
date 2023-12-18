    class Caption{
        public static void main(String args[]){
            CaptionTv ctv = new CaptionTv();
            ctv.channel = 10;
            ctv.channelUp();
            System.out.println(ctv.channel);
            ctv.caption = false;
            ctv.displayCaption("Hello there. Do u wanna know my secret?");
            ctv.displayCaption("secret is secret, I can't tell you");
        }
    }
class Tv{
    boolean power;
    int channel;


    void power(){power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
    }

    class CaptionTv extends Tv{
        boolean caption;
        void displayCaption(String text){
            if(caption){
                System.out.println(text);
            }
        }
    }
