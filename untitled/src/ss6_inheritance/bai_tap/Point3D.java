package ss6_inheritance.bai_tap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
//        super.setX(x);
//        super.getY(y);
        super(x,y);
        this.z =z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setXY(x,y);
        this.setZ(z);

    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = this.getX();
        result[1] = this.getY();
        result[2] = this.getZ();
        return result;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                z + ","
                + getX() + ","
                + getY() +
                '}'
                + super.toString();
    }

    public static class Point3DText {
        public static void main(String[] args) {
            Point3D point3D = new Point3D();
            System.out.println("value of x by: " + point3D.getX());
            System.out.println("vale of y by: " + point3D.getY());
            System.out.println("value of z by: " + point3D.getZ());

            point3D = new Point3D(7, 8, 9);
            System.out.println("rhe new value of x by: " + point3D.getX());
            System.out.println("the new vale of y by: " + point3D.getY());
            System.out.println("the new value of z by: " + point3D.getZ());
            System.out.println("("+ point3D.getX()+","+point3D.getY()+","+point3D.getZ()+")");
        }
    }
}
