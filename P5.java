/**
 * Filename P5
 * Application (driver program)
 */
import java.util.Scanner;           // read input from keyboard
public class P5
{
  private static final int POLYS = 4;  // 4 polygon objects
  private static P5Polygon [] a;      // Array of polygons

  public static void main(String[] args)
  {
    char choice;                    // repeat program
    double side;                   // input Hexagon, Octagon
    double height;                 // input Prisms
    String inputStr = null;        // input String
    Scanner scan = new Scanner(System.in);

    a = new P5Polygon[POLYS];     // allocate 4 polygon ref
    a[0] = new P5RegularHex();    // instantiate objects
    a[1] = new P5HexPrism(1.1, 2.2);
    a[2] = new P5RegularOctagon();
    a[3] = new P5OctagonalPrism(3.3, 4.4);
    prt();                        // display objects

    do
    {
      System.out.print("\nEnter Hexagon and Octagon (side):   ");
      side = scan.nextDouble();

      System.out.print("Enter Prism Height:      ");
      height = scan.nextDouble();

      a[0].setDim(side);          // reassign
      a[1].setDim(side, height);
      a[2].setDim(side);
      a[3].setDim(side, height);
      prt();                      // display objects
       
      System.out.print("\nWant to compare polygon figures (y/n)? ");
      inputStr = scan.next();     // read, assign to string
      choice = inputStr.charAt(0); // assign 1st character

    }while( choice != 'n' && choice != 'N');// loop until n or N
  }

  public static void prt()
  {
    int i;
    for(i = 0; i < POLYS; ++i)
    {
      if(i % 2 == 0)
      {
        System.out.print( a[i] + " has an area:");
        System.out.printf("\t%.3f \n", a[i].area() );
        System.out.print(a[i] + " has a perimeter: ");
        System.out.printf("\t%.3f \n", a[i].perimeter() );
      }
      else
      {
        System.out.print( a[i] + " has a surface area: ");
        System.out.printf("%.3f", a[i].area() );
        System.out.printf(" and volume: %.3f\n", a[i].volume() );
      }
    }
  }
}
