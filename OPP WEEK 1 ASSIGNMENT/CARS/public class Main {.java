public class Main {

    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setColour("Black");

        myCar.show();

        myCar.startEngine();

        myCar.accelerate();
        myCar.accelerate();

        myCar.turnLeftIndicatorOn();

        myCar.show();

        myCar.brake();

        myCar.turnIndicatorsOff();

        myCar.stopEngine();

        myCar.show();
    }
}
