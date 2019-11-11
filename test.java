import java.util.Random;

public class test
{
   public static void main(String[] args)
   {  
      
      int[] arr;
      Sort sorter=new Sort();
      
      for(int i=0;i<1000000;i=i*10)
      {
      arr=makeArray(i);
      
      sorter.QuickSort(copy(arr), 0, arr.length-1);
      sorter.MergeSort(copy(arr), 0, arr.length-1);
      sorter.BubbleSort(copy(arr));
      sorter.InsertionSort(copy(arr));
      sorter.SelectionSort(copy(arr));
  
      }
   }
   
   //Copies array so that we can use one without affecting results
   public static int[] copy(int[] a)
   {
      int[] array=new int [a.length];
   
      for(int i=0; i<a.length;i++)
      {
         array[i]=a[i];
      }
   
   return array;
   }
   
   //makes array with random numbers of size s
   public static int[] makeArray(int s)
   {
   
   int[] array=new int[s];
   Random r=new Random();
   
      for(int i=0; i<s; i++)
      {
         array[i]=r.nextInt();
      }
      
   return array;
   }
}
