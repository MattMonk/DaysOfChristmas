package daysofchristmas;

public class Daysofchristmas
{
    
    public String[] arrayPopulater(String[] arrayForPopulation)
    {
        for(int i=0;i<arrayForPopulation.length;i++)
        {
            String toArray="hi"+i;
            arrayForPopulation[i]=toArray;
        }
        return arrayForPopulation;
    }
    
    public void arrayPrinter(String[] printingArray)
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
        String[] reversedArray = new String[arrayLength];
        for(int i=0;i<arrayLength;i++)
        {
            reversedArray[i] = originalArray[arrayPosition-i];
        }
        return reversedArray;
    }

    public static void main(String[] args)
    {
        Daysofchristmas doc = new Daysofchristmas();
        String[] testArray = new String[3];
        doc.arrayPopulater(testArray);
        doc.arrayPrinter(testArray);
        doc.arrayPrinter(doc.arrayReverser(testArray));
    }

}
