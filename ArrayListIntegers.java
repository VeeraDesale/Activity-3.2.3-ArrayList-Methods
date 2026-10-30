/*
 * Activity 3.2.3
 */
//The problem was that the arrayList class had not been imported
import java.util.ArrayList;

public class ArrayListIntegers
{  
  public static void main(String[] args)
  {  
    ArrayList<Integer> newList = new ArrayList<Integer>();  
    newList.add(1);
    newList.add(5);
    newList.add(3);
    newList.add(8);
    
    // display elements
    System.out.println(newList);

  }  
}