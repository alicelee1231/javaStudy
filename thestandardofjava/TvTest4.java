class TvTest4{
    public static void main(String[] agrs){
        Tv[] tvArr = new Tv[3];

        // for (int i = 0; i < tvArr.length; i++){
        //     tvArr[i] = new Tv();
        //     tvArr[i].channel = i + 10 ;
        // }

        for(int i = 0; i < tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10 ;
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        } 
    }
}

class Tv{
    String color;
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}