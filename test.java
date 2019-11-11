import java.util.Random;
import java.io.*;

public class test
{
   public static void main(String[] args)
   {  
   
      try
      {
         PrintWriter Bubble=new PrintWriter(new File("BubbleSort.txt"));
         PrintWriter Insertion=new PrintWriter(new File("InsertionSort.txt"));
         PrintWriter Merge=new PrintWriter(new File("MergeSort.txt"));
         PrintWriter Quick=new PrintWriter(new File("QuickSort.txt"));
         PrintWriter Selection=new PrintWriter(new File("SelectionSort.txt"));

            
      
         int[] arr;
         Sort sorter=new Sort();
      
         for(int i=1;i<=1000000;i=i*10)
         {
            arr=makeArray(i);
            
            long time;
            
            time=System.nanoTime();
            sorter.BubbleSort(copy(arr));
            time=System.nanoTime()-time;
            
             Bubble.write(time+"\n");
            
            time=System.nanoTime();
            sorter.InsertionSort(copy(arr));
            time=System.nanoTime()-time;
            
             Insertion.write(time+"\n");
            
            time=System.nanoTime();
            sorter.MergeSort(copy(arr), 0, arr.length-1);
            time=System.nanoTime()-time;
            
             Merge.write(time+"\n");
            
            time=System.nanoTime();
            sorter.QuickSort(copy(arr), 0, arr.length-1);
            time=System.nanoTime()-time;
            
             Quick.write(time+"\n");
            
            time=System.nanoTime();
            sorter.SelectionSort(copy(arr));
            time=System.nanoTime()-time;
         
             Selection.write(time+"\n");

            System.out.println(i);
         }
      
      
      Bubble.close();
      Insertion.close();
      Merge.close();
      Quick.close();
      Selection.close();
      
      }
      catch(Exception e)
      {
         System.out.print("File not found");
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
