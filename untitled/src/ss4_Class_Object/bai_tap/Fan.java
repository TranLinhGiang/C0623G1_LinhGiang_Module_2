package ss4_Class_Object.bai_tap;

public class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private int speed = 1;

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public String toString() {
        String state = "";
        if (this.isOn()) {
            state += ("Fan is on");
            state += ("Speed" + this.speed);
        } else {
            state += ("Fan is off");

        }
        state += ("Color: " + this.color);
        state += ("Radius: " + this.radius);
        return state;
    }

    public static class Test {
        public static void main(String[] args) {
            Fan Fan1 = new Fan(3, true, 10, "yellow");
            Fan Fan2 = new Fan(2, false, 5, "blue");

            System.out.println(Fan1.toString());
            System.out.println(Fan2.toString());
            Fan2.setOn(true);
            System.out.println("");
            System.out.println(Fan2.toString());
        }
    }
}

