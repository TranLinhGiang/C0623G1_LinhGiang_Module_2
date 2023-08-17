package ss6_inheritance.bai_tap;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
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

    // setXY,getXY.
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] result = new float[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    @Override
    public String toString() {
        return "Point(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }

    public static class PointText {
        public static void main(String[] args) {
            Point point = new Point();
            point.setX(5);
            point.setY(8);
            System.out.println(point);

//            point = new Point(4, 6);
//            System.out.println(Arrays.toString(point.getXY()));
        }
    }
}
