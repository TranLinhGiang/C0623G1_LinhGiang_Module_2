package ss6_inheritance.bai_tap;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = getX();
        result[1] = getY();
        return result;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x ="+ this.getX() +
                ", y ="+ this.getY()+
                ", xSpeed=" + this.getXSpeed() +
                ", ySpeed=" + this.getYSpeed() +
                '}';
    }
    public MovablePoint move(){
        this.setX(this.getX()+this.getXSpeed());
        this.setY(this.getY()+this.getYSpeed());
        return this;
    }

    public static class MovablePointText {
        public static void main(String[] args) {
            MovablePoint movablePoint = new MovablePoint();
            System.out.println("(" + "x" + "=" + movablePoint.getX() + "," + "y" + "=" + movablePoint.getY() + ")");


            movablePoint = new MovablePoint(5, 8, 5, 8);
            System.out.println(movablePoint);

            System.out.println(movablePoint.move());

        }
    }
}
