/**
 * Created by bhawesh on 30/05/15.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Diamond with Name

 Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:

  *
 ***
 Bill
 ***
  *
 *
 *
 * */


public class DiamondWithName {
    private int NUM_OF_LEVELS;
    private String name="";

    public static void main (String args[]) throws IOException {
        DiamondWithName pma = new DiamondWithName();
        pma.getNumberOfLevels();
        pma.displayAstericks();
    }

    public int displayAstericks() {
        String astericks = "*";
        for(int levels = 1; levels <= this.NUM_OF_LEVELS - 1; levels++) {
            for(int spaces=0; spaces < this.NUM_OF_LEVELS - levels; spaces++)
                System.out.print(" ");
            for(int numOfAstericks = 0; numOfAstericks < 2 * levels - 1; numOfAstericks++)
                System.out.print(astericks);
            System.out.println();
        }
        System.out.println(this.name);
        for(int levels = this.NUM_OF_LEVELS - 1; levels > 0 ; levels--) {
            for(int spaces = this.NUM_OF_LEVELS - levels; spaces > 0 ;  spaces--)
                System.out.print(" ");
            for(int numOfAstericks = 2 * levels - 1; numOfAstericks > 0 ;  numOfAstericks--)
                System.out.print(astericks);
            System.out.println();
        }
        return 0;
    }

    public  int getNumberOfLevels() throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));

        System.out.println("please enter the number of times you want asterick '*' to be printed ");
        this.NUM_OF_LEVELS = Integer.parseInt(br.readLine());

        System.out.println("Please enter your name");
        this.name = br.readLine();

        return 0;
    }
}
