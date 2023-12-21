class TV{
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelup() {++channel;}
    void channeldown() {--channel;}
}

class VCR{
    boolean power
    int counter = 0
    void power(){power = !power;}
    void play(){System.out.println("do you wanna play with me?");}
    void stop(){System.out.println("i don't have a enough time to play with you");}
}

class TVCR extends TV{
    VCR vcr = new VCR();

    void play(){
        vcr.play();
    }
    void stop(){
        vcr.stop();
    }

    
}