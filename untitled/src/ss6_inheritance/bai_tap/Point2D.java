package ss6_inheritance.bai_tap;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // set, getXY;
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    @Override
    public String toString() {
        return "Poinnt2D{" +
                x +
                "," +
                y +
                '}'
                + super.toString();
    }

    public static class Poin2DText {
        public static void main(String[] args) {
            Point2D point2D = new Point2D();
            System.out.println("value of x by: " + " " + point2D.getX());
            System.out.println("value of y by: " + " " + point2D.getY());
            point2D= new Point2D(8,9);
            System.out.println("the new value of x by: " + " " +point2D.getX());
            System.out.println("the new value of x by: " + " " +point2D.getY());
            System.out.println("("+point2D.getX()+","+point2D.getY()+")");

        }
    }
}
