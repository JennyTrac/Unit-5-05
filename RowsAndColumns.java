/* created by jenny trac
created on dec 12 2017
program calculates average of a 2d array */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class RowsAndColumns {
    
    public static int[][] MakeArray (int rows, int columns)
    {
    // make array
    int[][] TheDoubleArray = new int[rows][columns];
    
    Random rand = new Random();
    int max = 50;
    int min = 1;
    int random_number = 0;
    for (int rowcounter = 0; rowcounter < TheDoubleArray.length; rowcounter++)
        {
        for (int columncounter = 0; columncounter < TheDoubleArray[rowcounter].length; columncounter++)
            {
            TheDoubleArray[rowcounter][columncounter] = rand.nextInt(max - min) + min;
            //System.out.println(TheDoubleArray[rowcounter][columncounter]);
            }    
        }
    
    return TheDoubleArray;
    }
    
    public static double AverageOfDoubleArray (int[][] twodimensionalarray)
        {
        int QuantityOfNumbers = twodimensionalarray.length * twodimensionalarray[0].length;
        int total = 0;
        for (int rowcount = 0; rowcount < twodimensionalarray.length; rowcount ++)
            {
            for (int columncount = 0; columncount < twodimensionalarray[rowcount].length; columncount++)
                {
                total = total + twodimensionalarray[rowcount][columncount];
                }
            }
        double the_average = total / QuantityOfNumbers;
        System.out.println(the_average);
        return the_average;
        }
    
    public static void main(String[] args)
    {
    // instructions
    System.out.println("How many rows would you like?");
    
    // input
    Scanner problem = new Scanner(System.in);
    int NumberOfRows = (problem.nextInt());
    System.out.println("How many columns would you like?");
    int NumberOfColumns = (problem.nextInt());
    //System.out.println(NumberOfRows);
    //System.out.println(NumberOfColumns);
    
    // making and showing array
    int[][] DoubleArray = RowsAndColumns.MakeArray(NumberOfRows, NumberOfColumns);
    System.out.println("Your numbers:");
    for (int rcount = 0; rcount < DoubleArray.length; rcount++)
        {
        StringBuilder ShowArray = new StringBuilder();
        for (int ccount= 0; ccount < DoubleArray[rcount].length; ccount++)
            {
            ShowArray.append(DoubleArray[rcount][ccount] + ", ");
            }
        System.out.println(ShowArray);
        }
    }
    
    // calculating and showing average
    double array_average = RowsAndColumns.AverageOfDoubleArray(DoubleArray);
    System.out.println("The average is: " + array_average);

}
