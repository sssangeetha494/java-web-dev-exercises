package exercises;
import java.util.Scanner;

public class alice
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence="Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'\n" +
                "\n";
        String newSentence=sentence.toLowerCase();
        System.out.println("enter term to search for within this string:");
        String term=input.nextLine().toLowerCase();

        if(newSentence.contains(term))
        {
            System.out.println("search term was found");
        }
        else
        {
            System.out.println("search term was not found");
        }
        int index=sentence.indexOf(term);
        int length=term.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence=sentence.replace(term,"");
        System.out.println(modifiedSentence);
    }
}
