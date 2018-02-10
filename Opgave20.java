import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class Opgave20 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);


        System.out.print("file #1 name? ");
        Scanner input1 = new Scanner(new File(console.nextLine()));
        System.out.print("file #2 name? ");
        Scanner input2 = new Scanner(new File(console.nextLine()));
        System.out.println();

        ArrayList<String> list1 = getWords(input1); // læser første input "hobbit.txt"
        ArrayList<String> list2 = getWords(input2); // læser andet input "mobydick.txt"

    }

    public static ArrayList<String> getWords(Scanner input) {
        // read all words and sort
        Set<String> words = new TreeSet<String>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            words.add(next);
        }
        System.out.println(words.size()); // udskriver unikke ord

        return new ArrayList<>(words);
    }
}
