/*
 Dat Nguyen
 CS5005 Lab2
 Spring 2022
 */

package distance;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the physics class with 5 point3d attributes.
 */
public class PhysicsTest {

  Point3D point1;
  Point3D point2;
  Point3D point3;
  Point3D point4;
  Point3D point5;

  /**
   * Setup the point3D class instance with different points for x,y,z.
   */
  @Before
  public void setUp() {

    point1 = new Point3D();
    point2 = new Point3D(4, 4, 4);
    point3 = new Point3D(234, 356, 124);
    point4 = new Point3D(63450, 3245, 97853);
    point5 = new Point3D(-653, -261, -975);
  }

  /**
   * Test the velocity method with different points and time.
   */
  @Test
  public void testVelocity() {

    double actual1 = Physics.velocity(point1, point2, 5);
    assertEquals(1.3856, actual1, 0.001);

    double actual2 = Physics.velocity(point3, point4, 40);
    assertEquals(2910.709, actual2, 0.001);

    double actual3 = Physics.velocity(point1, point5, 235);
    assertEquals(5.115, actual3, 0.001);

    double actual4 = Physics.velocity(point5, point2, 3456);
    assertEquals(0.349, actual4, 0.001);

  }

  /**
   * Test for negative time which should trigger the illegalArgumentexception.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testNegTimeVelocity() {

    Physics.velocity(point1, point2, -5);
    Physics.velocity(point3, point4, -40);
  }

  /**
   * Test for zero time which should trigger the illegalArgumentexception.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testZeroTimeVelocity() {

    Physics.velocity(point3, point4, 0);
  }


}


