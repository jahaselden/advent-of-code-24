import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HistorianHysteria {
    public static void main(String[] args) {

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        try {
            File file = new File("/Users/jennyhaselden/coding/AdventOfCode/advent-of-code-24/day1/puzzle_input.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                int leftNum = reader.nextInt();
                left.add(leftNum);
                int rightNum = reader.nextInt();
                right.add(rightNum);
                // todo: sort on insertion for better time complexity
            }

            Collections.sort(left);
            Collections.sort(right);

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred: could not find file.");
            e.printStackTrace();
        }

        int totalDistance = 0;

        for (int i = 0; i < left.size(); ++i){
            totalDistance += Math.abs(left.get(i) - right.get(i));
        }

        System.out.printf("Total Distance: %d%n", totalDistance);
    }
}