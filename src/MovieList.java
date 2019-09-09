import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MovieList {
    public static void main(String[] args) {
        // ArrayList<String> movies = new ArrayList<>();
        ArrayList<String> movies;
        movies = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String movie;
        String userAnswer;

        do {
            System.out.print("Enter a favorite movie to add to the list: ");         // User enters movies
            movie = keyboard.nextLine();
            movies.add(movie);
            System.out.println();

            System.out.println("Do you want to continue entering movies? (enter \"q\" to quit)");
            userAnswer = keyboard.nextLine().toLowerCase();
            System.out.println();
        }
        while(! userAnswer.equals("q"));

        Collections.sort(movies);                       // Sort in alphabetical order

        for (String motionPicture : movies) {
            System.out.println(motionPicture);
        }

        // Program to select a random movie for the user
        System.out.println();
        System.out.println("Do you want the program to select a movie for you? (Y|N)");
        userAnswer = keyboard.nextLine().toUpperCase();
        if (userAnswer.equals("Y")) {
            Random rand = new Random();
            int select = rand.nextInt(movies.size());
            System.out.println("I suggest you watch " + movies.get(select));
        }
    }
}
