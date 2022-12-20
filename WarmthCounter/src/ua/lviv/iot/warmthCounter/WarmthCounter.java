package ua.lviv.iot.warmthCounter;

record WarmthCounter(String name, double height, double price,
                     double maxSensitivity, int step, double massInKilo) {
    private static final String SOME_WARMTHCOUNTER_NAME = "ATB";

    public WarmthCounter(){
        this(SOME_WARMTHCOUNTER_NAME);
    }

    public WarmthCounter(final String name){
        this(name, 1.0);
    }

    public WarmthCounter(final String name, final double height){
        this(name, height, 20.0);
    }

    public WarmthCounter(String name, double height, double price){
        this(name, height, price, 5.0, 2, 10);
    }

    @Override
    public String toString(){
        return "name: " + this.name + "\nheight: " + this.height +
                "\nprice: " + this.price + "\nmaxSensitivity: " + this.maxSensitivity +
                "\nstep: "+ this.step + "\nmassInKilo: " + this.massInKilo;
    }

    public static String getStaticField(){
        return SOME_WARMTHCOUNTER_NAME;
    }

}