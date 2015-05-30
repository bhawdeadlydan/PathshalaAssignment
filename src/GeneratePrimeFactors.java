/**
 * Created by bhawesh on 30/05/15.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Prime Factors Exercise
 Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.

 For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
 *
 * */

public class GeneratePrimeFactors {
    private int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};
    private int num;
    public ArrayList<Integer> at = new ArrayList<Integer>();
   public static void main(String args[]){
       GeneratePrimeFactors gpf = new GeneratePrimeFactors();
       gpf.getInputNumber();
       gpf.generate();
       gpf.showNumbers();

   }

    public int showNumbers() {
        for(int numb : at){
            System.out.print(numb+", ");
        }
        return 0;
    }

    private  int generate() {
        int number =num;
        int index=0;
        while((number!=1)||(index !=19 )){
            if(number % primes[index] == 0){
                number = number/primes[index];
                at.add(primes[index]);
            }else{
                 index++;
            }
        }
        return 0;

    }

    public int getInputNumber() {
        System.out.println("Enter the number you want prime factors for");
        this.num = new Scanner(System.in).nextInt();
        return 0;
    }
}
