/**
 * Filename: P5Polygon
 * Abstract super class of P5RegularHex and P5FRegularHex
 *
 * P5Polygon() - no argument constructor, initialize side to one
 * P5POlygon(double) - over-loaded constructor, initialize to parameter
 *
 * toString() - format and return class name
 * getName() - generates name of this class object and returns it as String
 *
 * setDim(double) - assign 1 dimension of a 2-D polygon (side)
 * setDim(double,double) - assign 2 dimensions of a 3-D polydon (side,height)
 *
 * perimeter() - calculate perimeter of a polygon
 * area()  - calculate area of a polygon
 * volume() - calculate volume of a polygon
 *
 * Date created: 02/21/2013
 */
public abstract class P5Polygon
{
  ////////data fields///////
  protected double side;

  /////constructors////////
  /**
   * No-Argument constructor
   * Initialize side to 1
   */
   public P5Polygon()
   {
     side = 1.0;
   }
  /**
   * Over-loaded constructor
   * Initialize side to parameter
   */
   public P5Polygon(double s)
   {
    side = s;
   }
  
  /////////////methods////////////////
   /**
    * Filename: toString
    * Format and return class name
    */
   public String toString()
   {
     return(this.getClass().getName()); 
   }
   /**
    * Filename: getName
    * generates name of this class
    * object and returns as a string
    */
    public String getName()
    {
      return(this.getClass().getName() + ": ");
    }
    /**
     * Filename: setDim
     * assign 1 dimension of a 2-D
     * polygon (side)
     */
     public void setDim(double s)
     {
      this.side = s;
     }
     /**
      * Filename: setDim
      * assign 2 dimensions of a 3-D
      * polygon (side, height)
      * @param 2 doubles
      */
     public void setDim(double s, double h)
     {
      this.side = s;
     }
      /**
       * Filename: perimeter
       * Abstract method
       * to calculate perimeter
       * @return double
       */
      abstract double perimeter();
      /**
       * Filename: area
       * Abstract method
       * to calculate area
       * @return double
       */
      abstract double area();
      /** 
       * Filename: volume
       * Method to calculate volume
       * @return double
       */
      public double volume()
      {
       return 0.0;
      }
}
