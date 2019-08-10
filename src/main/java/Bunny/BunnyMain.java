package Bunny;

public class BunnyMain {
    public static void main(String[] args) {
        BunnyCounter bunnyCounter = new BunnyCounter();
        System.out.println(bunnyCounter.bunnyRec1(6));
        System.out.println(bunnyCounter.bunnyRec2(6));
        System.out.println(bunnyCounter.bunnyIter(6));
    }
}
