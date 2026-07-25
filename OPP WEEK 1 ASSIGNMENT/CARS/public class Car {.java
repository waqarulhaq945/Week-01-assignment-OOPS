public class Car {

    // Attributes
    private String colour;
    private int speed;
    private boolean engineOn;
    private boolean leftIndicatorOn;
    private boolean rightIndicatorOn;

    // Constructor
    public Car() {
        colour = "White";
        speed = 0;
        engineOn = false;
        leftIndicatorOn = false;
        rightIndicatorOn = false;
    }

    // Set colour
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Start engine
    public void startEngine() {
        engineOn = true;
        System.out.println("Engine Started.");
    }

    // Stop engine
    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println("Engine Stopped.");
    }

    // Increase speed
    public void accelerate() {
        if (engineOn) {
            speed += 10;
            System.out.println("Car Accelerated.");
        } else {
            System.out.println("Start the engine first.");
        }
    }

    // Decrease speed
    public void brake() {
        if (speed > 0) {
            speed -= 10;
        }

        if (speed < 0) {
            speed = 0;
        }

        System.out.println("Brake Applied.");
    }

    // Left indicator
    public void turnLeftIndicatorOn() {
        leftIndicatorOn = true;
        rightIndicatorOn = false;
        System.out.println("Left Indicator ON.");
    }

    // Right indicator
    public void turnRightIndicatorOn() {
        rightIndicatorOn = true;
        leftIndicatorOn = false;
        System.out.println("Right Indicator ON.");
    }

    // Turn indicators off
    public void turnIndicatorsOff() {
        leftIndicatorOn = false;
        rightIndicatorOn = false;
        System.out.println("Indicators OFF.");
    }

    // Show details
    public void show() {
        System.out.println("\n----- Car Information -----");
        System.out.println("Colour           : " + colour);
        System.out.println("Speed            : " + speed + " km/h");
        System.out.println("Engine           : " + (engineOn ? "ON" : "OFF"));
        System.out.println("Left Indicator   : " + (leftIndicatorOn ? "ON" : "OFF"));
        System.out.println("Right Indicator  : " + (rightIndicatorOn ? "ON" : "OFF"));
    }
}