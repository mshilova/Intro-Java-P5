/**
 * Filename: P5RegularOctagon
 * Subclass of P5Polygon
 * P5RegularOctagon() - no argument constructor, initialize side to one
 * P5RegularOctagon(s) - over-loaded constructor, initialize to param
 * toString() - override, format dimensions of octagon
 * perimeter() - override and implement super class perimeter
 * area() - override and implement super class area
 * Date created: 02/21/2013
 */

import java.math.*; // to access Math.sqrt()

public class P5RegularOctagon extends P5Polygon
{

 ///////constructors//////////
 /**
  * No aregument constructor
  * Initialize side to one
  */
 public P5RegularOctagon()
 {
   this.side = 1.0; 
 }
 /**
  * Over-loaded constructor
  * Pass the side parameter to P5Polygon(s)
  * @param double
  */
 public P5RegularOctagon(double s)
 {
   super(s);
 }

 /////////methods////////
 /**
  * Filename: perimeter
  * Overrride super class perimeter
  * calculate perimeter of octagon
  * @return result type double
  */
 public double perimeter()
 {
   return(8*side);
 }
 /**
  * Filename: area
  * Override area of superclass
  * calculate area of octagon
  * @return result type double
  */
 public double area()
 {
   return( 2*(1+Math.sqrt(2.0))*(side*side));
 }
 /**
  * Override super class toString
  * Format dimensions of octagon
  * @return name and dimensions of this object type String
  */
 public String toString()
 {
   return(this.getName() + " " + side + " side ");
 }
}
