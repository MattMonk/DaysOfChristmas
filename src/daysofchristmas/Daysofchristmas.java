package daysofchristmas;

public class Daysofchristmas
{
    private static String[] christmasArray = {"a Partridge in a Pear Tree", "Two Turtle Doves", "Three French Hens", "Four Calling Birds", "Five Gold Rings", "Six Geese a-Laying", "Seven Swans a-Swimming", "Eight Maids a-Milking", "Nine Ladies Dancing", "Ten Lords a-Leaping", "Eleven Pipers Piping", "Twelve Drummers Drumming"};
    private static String[] daysOfChristmas = {"1st", "2nd", "3rd"};
    
    public String[] arrayPopulater(String[] arrayForPopulation)
    {
        //Populates the array by adding "Hi" then a number starting from 0 to give unique data for each position in the array.
        for(int i=0;i<arrayForPopulation.length;i++)
        {
            String toArray="hi"+i;
            arrayForPopulation[i]=toArray;
        }
        return arrayForPopulation;
    }
    
    public void arrayPrinter(String[] printingArray) //self explanatory
    {
        for(int i=0;i<printingArray.length;i++)
        {
            System.out.println(printingArray[i]);
        }
    }
    
    public String[] arrayReverser(String[] originalArray)
    {
        int arrayLength = originalArray.length;
        int arrayPosition = arrayLength-1;
        String[] reversedArray = new String[arrayLength]; //new reversed array
        for(int i=0;i<arrayLength;i++)
        {
            //first pos in reversedArray = last pos in originalArray-- continues doing his to he end
            reversedArray[i] = originalArray[arrayPosition-i]; //has to be arrayPostion as array length is 3 but max array index is 2.
        }
        return reversedArray;
    }
    
    public void daysOfChristmas(String[] christmasArray, String[] dayofChristmas)
    {
        
        for(int i=0;i<christmasArray.length;i++)
        {
            if(i<3)
            {
                System.out.println("On the "+dayofChristmas[i]+" day of Christmas my true love gave to me:");
            }
            else //fix this, it goes 3rd then 3th...
            {
                System.out.println("On the "+i+"th day of Christmas my true love gave to me:");
            }
            
            for(int k=i;k>-1;)
            {
                System.out.println(christmasArray[k]);
                k=k-1;
            }
        }
    }

    public static void main(String[] args)
    {
        Daysofchristmas doc = new Daysofchristmas();
        String[] testArray = new String[3];
        doc.arrayPopulater(testArray);
        //doc.arrayPrinter(testArray);
        //doc.arrayPrinter(doc.arrayReverser(testArray)); //prints the result of array reverser
        doc.daysOfChristmas(christmasArray, daysOfChristmas);
    }

}
