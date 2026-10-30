/*
 * Activity 3.2.3
 */
import java.util.ArrayList;

public class ArrayListExample
{  
   public static void main(String[] args)
   {  
      ArrayList<String> animalList = new ArrayList<String>();  
      animalList.add("Dog");
      animalList.add("Cat");
      animalList.add("Rabbit");
      animalList.add("Frog");
      animalList.add("Horse");
      animalList.add("Cow");
      
      // display list
      System.out.println(animalList);
      
      /* your code here */ 
      //Problem 5:
      animalList.add("Bird");

      //Problem 6:
      animalList.add(3, "Snake");

      //Problem 7:
      System.out.println(animalList.get(2));
      System.out.println(animalList.get(3));

      //Problem 8:
      animalList.remove(4);
      
      // display modified list
      System.out.println(animalList);

      //Problem 9:
      System.out.println(animalList.size());
   }  
}