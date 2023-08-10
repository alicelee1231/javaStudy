class Upper {
    public static void main(String[]args){
        
        char a = 'a';
        for(int i = 0; i < 3; ++i){
            char upper = (char)(a-32);
            System.out.println(upper);
            a++;
    }
    }
}