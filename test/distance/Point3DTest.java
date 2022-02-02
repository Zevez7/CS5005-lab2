/*
 Dat Nguyen
 CS5005 Lab2
 Spring 2022
 */

package distance;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test for the class Point3D with 5 point3D attributes.
 */
public class Point3DTest {

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
   * Test to find the distance between the two points.
   */
  @Test
  public void testDistanceTo() {

    assertEquals(0, point1.distanceTo(point1), 0.001);
    assertEquals(6.928, point1.distanceTo(point2), 0.001);
    assertEquals(437.268, point2.distanceTo(point3), 0.001);
    assertEquals(116428.374, point3.distanceTo(point4), 0.001);
    assertEquals(1202.145, point1.distanceTo(point5), 0.001);
  }

  /**
   * Test to get the instance x value.
   */
  @Test
  public void testGetX() {

    assertEquals(0, point1.getX());
    assertEquals(4, point2.getX());
    assertEquals(234, point3.getX());
    assertEquals(63450, point4.getX());
    assertEquals(-653, point5.getX());
  }


  /**
   * Test to get the instance y value.
   */
  @Test
  public void testGetY() {
    assertEquals(0, point1.getY());
    assertEquals(4, point2.getY());
    assertEquals(356, point3.getY());
    assertEquals(3245, point4.getY());
    assertEquals(-261, point5.getY());
  }

  /**
   * Test to get the instance z value.
   */
  @Test
  public void testGetZ() {
    assertEquals(0, point1.getZ());
    assertEquals(4, point2.getZ());
    assertEquals(124, point3.getZ());
    assertEquals(97853, point4.getZ());
    assertEquals(-975, point5.getZ());

  }

  /**
   * Test to determine if to point3d instance are the same.
   */
  @Test
  public void testEquals() {
    assertNotEquals(null, point1);
    assertNotEquals(null, point2);
    assertNotEquals(point2, null);
    assertNotEquals(point1, point2);
    assertNotEquals(point5, point3);

    assertEquals(point2, point2);
    assertEquals(point1, point1);
    assertEquals(point5, point5);

  }

}