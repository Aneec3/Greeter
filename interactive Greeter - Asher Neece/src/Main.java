import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello friend!\n");
        Scanner in = new Scanner(System.in);

        String name;
        System.out.print("What's your name?    ");
        name = in.nextLine();
        System.out.println("Nice to meet you " + name + "!\n");

        String where;
        System.out.print("Where are you from?   ");
        where = in.nextLine();
        int age;
        System.out.print("How old are you?  ");
        age = in.nextInt();
        System.out.println("That's interesting you come from " + where + " and you're " + age + " years old.\n");

        String act;
        System.out.print("What's your favorite activity?    ");
        act = in.nextLine();
        double donation;
        System.out.println(act + "sounds like fun! How much would you like to donate today?  ");
        donation = in.nextInt();
        System.out.println("You are donating $" + donation + " today. Thank you! ");




    }}