package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class ArrayListChapter3 {
    public static void main(String[] args) {
        //sum of all the even numbers in an ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int sum = ArrayListChapter3.sumEven(arr);
        System.out.println(sum);
        //word in a list that has exactly 5 letters.
        String strings = "Mercury,Venus,Earth,Mars,Uranus,Neptune,Pluto";
        String str[] = strings.split(",");

        ArrayList<String> planets = new ArrayList<String>(
                Arrays.asList(str));
        // ArrayList<String> planets = new ArrayList<>();

       // planets.add("Mercury");
       // planets.add("Venus");
       // planets.add("Earth");
        //planets.add("Mars");
        String letterWord = ArrayListChapter3.letter(planets);
       // System.out.println(letterWord);


    }

    public static int sumEven(ArrayList<Integer> arr)
    {
        int total = 0;
        for(int numbers:arr)
        {
            if(numbers%2==0)
            {
                total+=numbers;
            }
        }
        return total;
    }
    public static String letter(ArrayList<String> planets)
    {
        Scanner input = new Scanner(System.in);

        String newWords="";
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for(String word:planets)
        {
            if(word.length()==numChars)
            {
              System.out.println(word);
               newWords=word;
            }
        }
        return newWords;
    }

}