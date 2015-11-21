package daysofchristmas;

import java.util.concurrent.TimeUnit;

public class Daysofchristmas
{
    private static String[] christmasArray = {"a Partridge in a Pear Tree", "Two Turtle Doves", "Three French Hens", "Four Calling Birds", "FIVE GOOOOLD RINGS", "Six Geese a-Laying", "Seven Swans a-Swimming", "Eight Maids a-Milking", "Nine Ladies Dancing", "Ten Lords a-Leaping", "Eleven Pipers Piping", "Twelve Drummers Drumming"};
    private static String[] daysOfChristmas = {"1st", "2nd", "3rd"};

    public void daysOfChristmas(String[] christmasArray, String[] dayofChristmas)
    {
        
        for(int i=0;i<christmasArray.length;i++)
        {
            if(i<3) //Use an array for first three values because they are awkward
            {
                System.out.println("\nOn the "+dayofChristmas[i]+" day of Christmas my true love gave to me:");
            }
            else 
            {
                int day=i+1; //because i starts at 0 the day would be off by one
                System.out.println("\nOn the "+day+"th day of Christmas my true love gave to me:");
            }
            
            for(int k=i;k>=0;)//Prints out the values in the array in decreasing order
            {
                if(k==4)
                {
                    System.out.println("\n\n"+christmasArray[k]+"\n\n");
                    try
                    {
                        TimeUnit.SECONDS.sleep(1);
                    }
                    catch(InterruptedException e)
                    {
                        
                    }
                }
                else
                {
                    System.out.println(christmasArray[k]);
                }
                k=k-1;
            }
            try
            {
                TimeUnit.SECONDS.sleep(2);
            }
            catch(InterruptedException e)
            {
                
            }
        }
    }

    public static void main(String[] args)
    {
        Daysofchristmas doc = new Daysofchristmas();
        doc.daysOfChristmas(christmasArray, daysOfChristmas);
    }

}
