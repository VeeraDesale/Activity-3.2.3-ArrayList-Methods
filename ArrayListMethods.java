
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods
{
    public static void main(String[] args)
    {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Rabbit");

        Scanner input = new Scanner(System.in);

        
        String command = "";

        while (!command.equals("q")){
            System.out.println(animals);

            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace or (q)uit?");

            command = input.nextLine();
            
            if (command.equals("a")){
                System.out.println("Enter an animal:");
                String animal = input.nextLine();
                animals.add(animal);
            }

            
            else if (command.equals("i")){
                System.out.println("Enter an animal:");
                String animal = input.nextLine();

                System.out.println("Enter a position:");
                int position = Integer.parseInt(input.nextLine());

                if (position >= 1 && position <= animals.size() + 1) {
                    animals.add(position - 1, animal);
                } else{
                    System.out.println("Bad position!");
                }
            }

            
            else if (command.equals("r")){
                System.out.println("Enter a position:");
                int position = Integer.parseInt(input.nextLine());

                if (position >= 1 && position <= animals.size()){
                    animals.remove(position - 1);
                } else{
                    System.out.println("Bad position!");
                }
            }

            
            else if (command.equals("p")){
                System.out.println("Enter an animal:");
                String animal = input.nextLine();

                System.out.println("Enter a position:");
                int position = Integer.parseInt(input.nextLine());

                if (position >= 1 && position <= animals.size()){
                    animals.set(position - 1, animal);
                } else{
                    System.out.println("Bad position!");
                }
            }

        }

    }
}
