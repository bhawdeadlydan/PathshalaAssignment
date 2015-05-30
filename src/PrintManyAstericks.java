/**
 * Created by bhawesh on 30/05/15.
 *
 */

import java.util.Scanner;

/**
*     Given a number n, print n asterisks on one line.
*      Example when n=8:
 *     ********
* */


public class PrintManyAstericks {
    private int NUM_OF_ASTRERICKS;

    public static void main (String args[]){
        PrintManyAstericks pma = new PrintManyAstericks();
        pma.getNumberOfAstericks();
        pma.displayAstericks();



    }

    public int displayAstericks() {
        String astericks="";
        for(int count=0; count<this.NUM_OF_ASTRERICKS; count++) {
            astericks +="*";
        }
        System.out.println(astericks);
        return 0;
    }

    public  int getNumberOfAstericks() {
        System.out.println("Please enter the number of times you want asterick '*' to be printed ");
        this.NUM_OF_ASTRERICKS = new Scanner(System.in).nextInt();
        return 0;
    }



}
