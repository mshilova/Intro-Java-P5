/**
 * Filename: P5HexPrism
 * Subclass of P5RegularHex
 * P5HexPrism() - no argument constructor, initialize height to one
 * P5HexPrism(s,h) - over-loaded constructor, initialize to param
 * toString() - override, return String of dimensions of hexagonal prism
 * setDim(s,h) - override, assign dimensions of hexagonal prism
 * area() - override super class area, calculate area of hexagonal prism
 * volume() - override, calculate volume of hexagonal prism
 * Date created: 02/21/2013
 */
public class P5HexPrism extends P5RegularHex
{
  /////////data fields///////////
  protected double height; 
 
  /////constructors//////////////
  /**
   * No argument constructor
   * Initialize height to one
   */
  public P5HexPrism()
  {
   this.height = 1;
  }
  /**
   * Over-loaded constructor
   * Pass the side to P5Polygon(s)
   * Set height to param
   * @param 2 doubles
   */
  public P5HexPrism(double s, double h)
  {
   super(s);
   height = h;
  }
 
 ///////////Methods/////////////////////
 /**
  * Filename: area
  * override super class area
  * Calculate area of hexagonal prism
  * @return result type double
  */
 public double area()
 {
  return(2*super.area() + super.perimeter()*height); 
 }
 /**
  * Filename: volume
  * override super class volume
  * Calculate volume of hexagonal prism
  * @return result type double
  */
 public double volume()
 {
   return(height*super.area());
 }
 /**
  * Filename: toString
  * Override parent class toString
  * Format dimensions of hexagonal prism
  * @return dimensions of type String
  */
 public String toString()
 {
  return(this.getName() + "       "  + side + " x " + height);
 }

 /**
  * Filename: setDim
  * override setDim of super class
  * @param two doubles
  * pass side to super class setDim(s)
  * set height to param
  */
 public void setDim(double s, double h)
 {
   super.setDim(s);
   this.height = h;
 }
}
