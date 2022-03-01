package assignment6.hashcode_and_equals;

public class MainClass {
    public static void main(String[] args) {
        Point3D cartesianPoint = new CartesianPoint(1,2,3);
        Point3D cylindricalPoint = new CylindricalPoint(2,0.3,3);
        System.out.println(cartesianPoint.equals(cylindricalPoint));
    }
}
