package exercises;
import java.util.*;
public class ArrayChapter3
{
    public static void main(String[] args)
    {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for(int numbers:integerArray)
        {
            if(numbers%2!=0)
            {
                System.out.println(numbers);
            }
        }
        String phrase = "I would not, could not, in a box. I would not," +
                " could not with a fox. I will not eat them in a house." +
                " I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }

}
