import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File("C:/Users/elena/nology/Java/hangman-java-project/untitled/hangman-words.txt"));

        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }

        Random rand = new Random();

        String word = words.get(rand.nextInt(words.size()));

        List<Character> playerGuesses = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }
}