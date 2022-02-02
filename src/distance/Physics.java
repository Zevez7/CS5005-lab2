package distance;

public class Physics {


  public static double velocity(Point3D one, Point3D two, double elapsedTime) {

    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Cannot be zero or negative time");
    }

    double distance = one.distanceTo(two);

    return distance / elapsedTime;

  }

  public static void main(String[] args) {

    try {
      Point3D one = new Point3D();
      Point3D two = new Point3D(1, 1, 1);
      System.out.println("Displacement = " + one.distanceTo(two));
      double velocity = Physics.velocity(one, two, 0);
      System.out.println("Velocity = " + velocity);
      velocity = Physics.velocity(one, two, 5);
      System.out.println("Velocity = " + velocity);

    } catch (IllegalArgumentException e) {
      System.out.println("Error catch " + e.getMessage());
    }
  }

}
