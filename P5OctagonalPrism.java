/**
 * Filename: P5OctagonalPrism
 * Subclass of P5RegularOctagon
 * P5OctagonalPrism() - no argument constructor, initialize height to one
 * P5OctagonalPrism(s,h) - over-loaded constructor, initialize height to one
 * setDim(s,h) - override, assign dimensions of octagonal prism
 * toString() - override, return a String with formatted dimensions of 
 *              octagonal prism
 * area() - override super class area, calculate area of octagonal prism
 * volume() - override and implement super class volume
 * Date created: 02/21/2013
 */
public class P5OctagonalPrism extends P5RegularOctagon
{
  ///////fields//////////
  protected double height;

  ////////constructors///////
  /**
   * No argument constructor
   * Initialize height to one
   */
  public P5OctagonalPrism()
  {
   this.height = 1.0;
  }
  /**
   * Over-loaded constructor
   * Pass side to super(s)
   * Initialize height to param
   * @param two doubles
   */
  public P5OctagonalPrism(double s, double h)
  {
   super(s);
   this.height = h;
  }
  ///////////methods////////////////////
  /**
   * Filename: setDim
   * Override super class setDim
   * Assign dimensions of octagonal prism
   * @param two doubles
   */
  public void setDim(double s, double h)
  {
   super.setDim(s);
   this.height = h;
  }
  /**
   * Filename: area
   * Override super class area
   * Calculare surface area of octagonal prism
   * @return result type double
   */
  public double area()
  {
    return(2*super.area() + super.perimeter()*height);
  }
  /**
   * Filename: volume
   * Override volume of super class
   * Calculate volume of octagonal prism
   * @return result type double
   */
  public double volume()
  {
    return(height*super.area());
  }
  /**
   * Filename: toString
   * Override toString of Parent class
   * Format dimensions of octagonal prism
   * @return result type String
   */
  public String toString()
  {
   return(this.getName() + " " + side + " x " + height);
  }
}
