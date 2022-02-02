package distance;

public class Point3D {

  private int x;
  private int y;
  private int z;

  public Point3D() {
    this.x = 0;
    this.y = 0;
    this.z = 0;
  }

  //Overload constructor
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double distanceTo(Point3D other) {

    double value = Math.sqrt(
        Math.pow(other.x - this.x, 2) +
            Math.pow(other.y - this.y, 2) +
            Math.pow(other.z - this.z, 2)
    );
    return value;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }

  @Override
  public boolean equals(Object other) {

    //same object
    if (this == other) {
      return true;
    }
//
    if (other == null) {
      return false;
    }
    if (this.getClass() == other.getClass()) {
      Point3D o = (Point3D) other;

      if ((this.x == o.x) && (this.y == o.y) && (this.z == o.z)) {
        return true;
      }

    }
    return false;
  }
}
