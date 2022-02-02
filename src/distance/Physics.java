/*
 Dat Nguyen
 CS5005 Lab2
 Spring 2022
 */

package distance;

/**
 * A class used to calculate the velocity of two point3d class instance.
 */
public class Physics {

  /**
   * Calculate the velocity of two point3d class instance with a set elapsed time in seconds.
   *
   * @param one         Point3D instance
   * @param two         Point3D instance
   * @param elapsedTime time in seconds
   * @return The velocity of the distance traveling between the two points
   */
  public static double velocity(Point3D one, Point3D two, double elapsedTime) {

    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Cannot be zero or negative time");
    }

    double distance = one.distanceTo(two);

    return distance / elapsedTime;

  }

  /**
   * Method that outputs the instanitation of 2 Point3D class and calculate the velocity between
   * them divide it by the elapsed time in seconds.
   *
   * @param args arguments for the main method
   */
  public static void main(String[] args) {

    try {
      Point3D one = new Point3D();
      Point3D two = new Point3D(1, 1, 1);
      System.out.println("Displacement = " + one.distanceTo(two));
      double velocity = Physics.velocity(one, two, 0);
      System.out.println("Prof. Keith is on the move! His Velocity =" + velocity);
      velocity = Physics.velocity(one, two, 5);
      System.out.println("Velocity =" + velocity);

    } catch (IllegalArgumentException e) {
      System.out.println("Encountered an error: " + e.getMessage());
    }
  }

}
