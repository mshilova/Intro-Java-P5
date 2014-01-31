/**
 * Filename: P5RegularHex
 * Subclass of P5Polygon
 *
 * P5RegularHex() - no argument constructor
 * P5regularHex(s)-over-loaded constructor, pass side param to P5Polygon(s)
 * toString() - implement toString, format dimensions of a hexagon
 * perimeter() - override and implement super class perimeter
 * area() - override and implement super class area
 *
 * Date created: 02/21/2013
 */
import java.math.*;  // for access to Math.sqrt()

public class P5RegularHex extends P5Polygon
{
 //////constructors//////////////

 /**
  * No argument constructor
  * Initialize side to 1
  */
  public P5RegularHex()
  {
    this.side = 1.0; 
  }
 /**
  * Over-loaded constructor
  * Initialize to param
  * @param double
  */
  public P5RegularHex(double s)
  {
    super(s);
  }
 
 ///////methods////////////////
 /**
  * Filename: perimeter
  * Override super class perimeter
  * Calculate perimeter
  * @return result type double
  */
  double perimeter()
  {
    return (6*side);
  }
 /**
  * Filename: area
  * Override super class area
  * Calculate area of regular hexagon
  * @return area type double
  */
  double area()
  {
    double area;
    area = (((Math.sqrt(3.0)*3) / 2) * (side*side)); 
    return area;
  }
 /**
  * Filename: toString()
  * overrides toString of parent class
  * @return formated dimensions of regular hexagon
  * type String
  */
  public String toString()
  {
    return (this.getName() + "     " + this.side + " side ");
  }
}
