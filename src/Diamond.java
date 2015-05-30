import java.util.Scanner;

/**
 * Created by bhawesh on 30/05/15.
 */
public class Diamond {
    private int NUM_OF_LEVELS;

    public static void main (String args[]){
        Diamond pma = new Diamond();
        pma.getNumberOfLevels();
        pma.displayAstericks();
    }

    public int displayAstericks() {
        String astericks = "*";
        for(int levels = 1; levels <= this.NUM_OF_LEVELS; levels++) {
            for(int spaces=0; spaces < this.NUM_OF_LEVELS - levels; spaces++)
                System.out.print(" ");
            for(int numOfAstericks = 0; numOfAstericks < 2 * levels - 1; numOfAstericks++)
                System.out.print(astericks);
            System.out.println();
        }

        for(int levels = this.NUM_OF_LEVELS - 1; levels > 0 ; levels--) {
            for(int spaces = this.NUM_OF_LEVELS - levels; spaces > 0 ;  spaces--)
                System.out.print(" ");
            for(int numOfAstericks = 2 * levels - 1; numOfAstericks > 0 ;  numOfAstericks--)
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
