public class Main {
    static int a= 3, b=10;

    public static void main(String[] args) {
        if ( a == 3){ b=11; }
        else{b= 12;}
        System.out.println(b);
        AA();
    }
    public static void AA() {
        b = (a==4) ? 10: 19 ;
        System.out.println(b);
    }
}
