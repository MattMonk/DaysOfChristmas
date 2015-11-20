package daysofchristmas;

public class Daysofchristmas
{
    
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

    public static void main(String[] args)
    {
        Daysofchristmas doc = new Daysofchristmas();
        String[] testArray = new String[3];
        doc.arrayPopulater(testArray);
        doc.arrayPrinter(testArray);
        doc.arrayPrinter(doc.arrayReverser(testArray)); //prints the result of array reverser
    }

}
