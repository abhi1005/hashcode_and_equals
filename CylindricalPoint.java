package assignment6.hashcode_and_equals;

public class CylindricalPoint extends Point3D{

    public CylindricalPoint(double r, double thetha, double z) {
        super(r*Math.cos(thetha), r*Math.cos(thetha), z);
    }

    @Override
    public int hashCode() {
        return (int)(x+y+z)%1000000009;
    }

    @Override
    public boolean equals(Object obj) {
        double x=0,y=0,z=0;
        if(obj instanceof CylindricalPoint){
            CylindricalPoint cylindricalPoint = (CylindricalPoint) obj;
            x = cylindricalPoint.getX();
            y = cylindricalPoint.getY();
            z = cylindricalPoint.getZ();
        }
        if(obj instanceof CartesianPoint){
            CartesianPoint cartesianPoint = (CartesianPoint) obj;
            x = cartesianPoint.getX();
            y = cartesianPoint.getY();
            z = cartesianPoint.getZ();
        }
        return getX() == x && getY() == y && getZ() == z;
    }
}
