import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

    Scanner input = new Scanner(System.in);
    String menuChoice = "";
    String menu = "What is your party affiliation D - Democrat\tR - Republican\tI - Independent\t - Other?";

    System.out.print(menu);
    menuChoice = input.nextLine();

    if(menuChoice.equalsIgnoreCase("D"))
    {
        System.out.println("You get a Donkey!");
    }
    else if (menuChoice.equalsIgnoreCase("R"))
    {
        System.out.println("You get a Elephant!");
    }
    else if (menuChoice.equalsIgnoreCase("I"))
    {
        System.out.println("You get a Person!");
    }
    else
    {
        System.out.println("You get a Other!");
    }

    }
}