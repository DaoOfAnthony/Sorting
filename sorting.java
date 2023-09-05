import java.util.*; 
/**
 * Write a description of class sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sorting
{
    // instance variables - replace the example below with your own
    int[] numbers = new int[10]; 

    public static void test()
    {
        int[] testArray = {5, 20, 60, 40, 45, 4, 19, 38};
        
        int[] testArray1 = {70, 4, -5, -5, 20, 17, 23};
        
        int[] testArray2 = {-4, -7, -20, -50, -100, -5};
        
        //selectionSort(testArray1);
        
        insertionSort(testArray);
        insertionSort(testArray1);
        insertionSort(testArray2);
        
        //bubbleSort(testArray);
        
        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(testArray1));
        System.out.println(Arrays.toString(testArray2));
    }

    public static void selectionSort(int[] numbers)
    {
        for (int i = 0; i < numbers.length - 1; i++)
        {
            int minLoc = i; 
            for (int j = i + 1; j < numbers.length; j++)
            {
                if(numbers[j] < numbers[minLoc])
                {
                    minLoc = j;
                }
            }
            
            int temp = numbers[minLoc];
            numbers[minLoc] = numbers[i];
            numbers[i] = temp;
        }
    }
    
    public static void insertionSort(int[] numbers)
    {
        for (int i = 1; i < numbers.length; i++)
        {
            int currentLoc = i;
            for(int j = currentLoc; j > 0; j--)
            {
                if (numbers[j-1] > numbers[j])
                {
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp; 
                }
            }
        }
    }
    
    public static void bubbleSort(int[] numbers)
    {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length - 1; j++)
            {
                if (numbers[j] > numbers[j+1])
                {
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp; 
                }
            }
        }
    }
    
    public static void mergeSort(int[] numbers)
    {
        mergeSort(0, numbers.length - 1, numbers); 
    }
    
    public static void mergeSort(int start, int end, int[] numbers)
    {
        if (start == end)
        {
            return;
        }
        
        int midPoint = (start + end)/ 2;
        
        mergeSort(start, midPoint, numbers);
        mergeSort(midPoint + 1, end, numbers);
        
        merge(start, end, midPoint, numbers);
    
        
    }
    
    public static void merge(int start, int end, int midPoint, int[] array)
    {
      int leftCursor = start;
      int rightCursor = midPoint + 1;
      int newCursor = 0;
      int[] newArray = new int[end - start + 1]; 
      
      
      while(leftCursor <= midPoint && rightCursor <= end)
      {
        if( array[leftCursor] < array[rightCursor])
        {
            newArray[newCursor] = array[leftCursor];
            newCursor++;
            leftCursor++;
        }
        
        else
        {
            newArray[newCursor] = array[rightCursor];
            newCursor++;
            rightCursor++;
        }
      }
      
      
      
    }
}
