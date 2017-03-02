
//Welcome to beginner level commentary
/**
By qymspace;
**/

//Here we import all the libaries we will ned to use in the program
//N.B An IDE(Integrated development Environment) ussually autoimport these for you.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ArrayM {

        public static void main(String[] args) throws IOException  {
                BufferedReader reader = 
                                new BufferedReader(new InputStreamReader(System.in));
                Scanner scanN = new Scanner(System.in);


                int N = scanN.nextInt();//Store the next integer the use types and presses enter in the variable N. This is the size of the array

                String[] A = reader.readLine()//The expect input will be a space separated series of integers. 
                .split(" ");				//We therefore need to split the series at every space interval.

                //Loop through the array from the last item to the first item. Printing out the values.
                //Remember N is the size of the array but array indexes start from zero, not 1. Hence we subtract 1 to get the last index.
                for (int i = (N - 1); i>= 0; i--)
                {
                        System.out.print(A[i]);
                        if(i != 0)//Do this unless this is the last item
                        {
                                System.out.print(" ");//Add a space inbetween the numbers.
                        }
                }
                scanN.close();//Close the scanner. Good programming practice.
        }
}
