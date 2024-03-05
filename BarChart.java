
package barchart;

import java.util.Random;

public class BarChart
{
    public static void main( String[] args )
    {
    int[] array = new int [30];
    System.out.println( "Grade distribution:" );
    Random randomNumbers = new Random();
    // for each array element, output a bar of the chart
    for ( int counter = 0; counter <= 10; counter++ )
    {
        
    // output bar label ( "00-09: ", ..., "90-99: ", "100: " )
    if ( counter == 10 ){
        System.out.printf( "%5d: ", 100 );
    }
    else
    {
        System.out.printf( "%02d-%02d: ",
        counter * 10, counter * 10 + 9 );
        // print bar of asterisks
        for ( int stars = 0; stars < array[ counter ]; stars++ )
        
        System.out.print( "*" );
    }
        System.out.println(); // start a new line of output}
        ++array[ 1 + randomNumbers.nextInt( 30 )];
     
    } // end outer for
  } // end main
} // end class BarChart
      

