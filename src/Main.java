public class Main {
    public static void main(String[] args) {
        Time time = new Time(12,55,01);
        System.out.println("next second:     "+time.nextSecond());
        System.out.println("previous second: "+time.previousSecond());


    }
}