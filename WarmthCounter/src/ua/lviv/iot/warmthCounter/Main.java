package ua.lviv.iot.warmthCounter;

public class Main {
    public static void main(String[] args){
        WarmthCounter WarmthCounter1 = new WarmthCounter();
        WarmthCounter WarmthCounter2 = new WarmthCounter("NAME2", 1.2);
        WarmthCounter WarmthCounter3 = new WarmthCounter("NAME3", 0.5, 10);
        System.out.println("WarmthCounter1:");
        System.out.println("---------------");
        System.out.println(WarmthCounter1);
        System.out.println("---------------");
        System.out.println("WarmthCounter2:");
        System.out.println("---------------");
        System.out.println(WarmthCounter2);
        System.out.println("---------------");
        System.out.println("WarmthCounter3:");
        System.out.println("---------------");
        System.out.println(WarmthCounter3);
        System.out.println("---------------");
        System.out.println(WarmthCounter.getStaticField());
    }
}
