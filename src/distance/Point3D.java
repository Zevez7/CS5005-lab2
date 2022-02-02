/*
 Dat Nguyen
 CS5005 Lab2
 Spring 2022
 */

package distance;

/**
 * A class used to store and calculate the distance in a 3D space. Has the X,Y,Z attribute.
 */
public class Point3D {

  private int x;
  private int y;
  private int z;

  /**
   * The default constructor with no initial location provided.
   */
  public Point3D() {
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }

  /**
   * Initiate the point3d class instance with 3 int location.
   *
   * @param x integer location
   * @param y integer location
   * @param z integer location
   */
  //Overload constructor
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Get the distance from another Point3D class to the current class instance location.
   *
   * @param other another point3d instance class.
   * @return a double of the distance
   */

  public double distanceTo(Point3D other) {

    double value = Math.sqrt(
        Math.pow(other.x - this.x, 2)
            + Math.pow(other.y - this.y, 2)
            + Math.pow(other.z - this.z, 2)
    );
    return value;
  }

  /**
   * Get the x attribute of the class instance.
   *
   * @return x attribute int.
   */
  public int getX() {
    return x;
  }

  /**
   * Get the y attribute of the class instance.
   *
   * @return y attribute int.
   */
  public int getY() {
    return y;
  }

  /**
   * Get the z attribute of the class instance.
   *
   * @return z attribute int.
   */
  public int getZ() {
    return z;
  }

  /**
   * Test to see if the object passed is equal to the class instance object.
   *
   * @param other Point3D object
   * @return boolean object is equal
   */
  @Override
  public boolean equals(Object other) {

    //same object
    if (this == other) {
      return true;
    }

    if (other == null) {
      return false;
    }
    // same class
    if (this.getClass() == other.getClass()) {
      Point3D o = (Point3D) other;

      if ((this.x == o.x) && (this.y == o.y) && (this.z == o.z)) {
        return true;
      }

    }
    return false;
  }
}
