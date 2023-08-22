import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * To display planetary data using custom methods
 *
 * @author Amr Elhady
 * @version 12/27/22
 */
public class PlanetGravity
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
     
    public static void header()
    {
        System.out.println("\t\t\t\tPlanetary Data\n");
        System.out.println(" Planet \t\t Diameter (km) \t\t Mass(kg) \t g (m/s^2)");
        System.out.println("-------------------------------------------------------------------------");

        return;
    }
    public static double surfaceGravity( double M, double d)
    {
        double G = 6.67 * Math.pow( 10, -11);
        double r = (d / 2000);
        double g = (G * M) / Math.pow(r , 2);

        return g;
    }
    public static void planetData( String planet, double M, double d)
    {
        double g = surfaceGravity( M , d );

        System.out.print( planet + "\t" );

        System.out.print( "\t" + df.format(d) + "\t" );

        System.out.print( "\t" + String.format("%6.2e",M)  );

        System.out.println( g );
    }
    public static void main( String args [] )
    {
        
        header();
        planetData("Mercury", 3.3 * Math.pow(10,23), 4880);
        planetData("Venus", 4.869 * Math.pow(10,24), 12103);
        planetData("Earth", 5.972 * Math.pow(10,24), 12756.3);
        
        
    }

}
