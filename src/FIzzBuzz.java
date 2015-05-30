/**
 * Created by bhawesh on 30/05/15.
 */
/**
 * FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.

 Create a FizzBuzz() method that prints out the numbers 1 through 100.
 Instead of numbers divisible by three print "Fizz".
 Instead of numbers divisible by five print "Buzz".
 Instead of numbers divisible by three and five print "FizzBuzz".

 Sample Output:
 1
 2
 Fizz
 4
 Buzz
 Fizz
 7
 8
 Fizz
 Buzz
 11
 Fizz
 13
 14
 FizzBuzz
 *
 * */

public class FIzzBuzz {

    public static void main (String args[]){

        FIzzBuzz fb = new FIzzBuzz();
        fb.FizzBuzz();


    }

    private int FizzBuzz() {
        for(int numbers = 1 ; numbers <= 100 ; numbers++ ){
            boolean print = false ;
            if(numbers % 3 == 0){
                System.out.print("Fizz");
                print = true;
            }
            if(numbers % 5 == 0){
                System.out.print("Buzz");
                print = true;
            }
            if(!print){
                System.out.print(numbers);
            }
            System.out.println();
        }

        return 0;
    }

}
