/**
 * Created by bhawesh on 30/05/15.
 */

import java.util.Scanner;

/**
 * Draw a right triangle

 Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
 Example when n=3:
 *
 **
 ***
 *
 * */

public class VerticalTriangle {

    private int NUM_OF_LEVELS;

    public static void main (String args[]){
        VerticalTriangle pma = new VerticalTriangle();
        pma.getNumberOfLevels();
        pma.displayAstericks();

    }

    public int displayAstericks() {
        String astericks="*";
        for(int levels = 1; levels <= this.NUM_OF_LEVELS; levels++) {
            for(int numOfAstericks=0; numOfAstericks<levels; numOfAstericks++)
            System.out.print(astericks);
            System.out.println();
        }
        return 0;
    }

    public  int getNumberOfLevels() {
        System.out.println("Please enter the number of times you want asterick '*' to be printed ");
        this.NUM_OF_LEVELS = new Scanner(System.in).nextInt();
        return 0;
    }


}
