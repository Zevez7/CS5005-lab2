package distance;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PhysicsTest {

  Point3D point1;
  Point3D point2;
  Point3D point3;
  Point3D point4;
  Point3D point5;

  @Before
  public void setUp() {

    point1 = new Point3D();
    point2 = new Point3D(4, 4, 4);
    point3 = new Point3D(234, 356, 124);
    point4 = new Point3D(63450, 3245, 97853);
    point5 = new Point3D(-653, -261, -975);
  }

  @Test
  public void testVelocity() {

    double actual1 = Physics.velocity(point1, point2, 5);
    double actual2 = Physics.velocity(point3, point4, 40);
    double actual3 = Physics.velocity(point1, point5, 235);
    double actual4 = Physics.velocity(point5, point2, 3456);

    assertEquals(1.3856, actual1, 0.001);
    assertEquals(2910.709, actual2, 0.001);
    assertEquals(5.115, actual3, 0.001);
    assertEquals(0.349, actual4, 0.001);
  }


  @Test(expected = IllegalArgumentException.class)
  public void testNegTimeVelocity() {

    Physics.velocity(point1, point2, -5);
    Physics.velocity(point3, point4, -40);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testZeroTimeVelocity() {

    Physics.velocity(point3, point4, 0);
  }


}


