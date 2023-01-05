import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day1 {
    BufferedReader input;

    Day1(String inputfile) throws FileNotFoundException {
        input = new BufferedReader(new FileReader(inputfile));
    }

    public void runIt() throws IOException {
        int[] maxCals = new int[4];
        int curCals = 0;
        String line = input.readLine();
        while (line != null) {
            while (line != null && !line.isEmpty()) {
                curCals += Integer.parseInt(line);
                line = input.readLine();
            }
            maxCals[0] = curCals;
            if (maxCals[0] > maxCals[1]) {
                Arrays.sort(maxCals);
            }
            curCals = 0;
            line = input.readLine();
        }
        int total = 0;
        for (int i = 0; i < maxCals.length; i++) {
            System.out.println(maxCals[i]);
            if (i > 0) {
                total += maxCals[i];
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) throws IOException {
        String inputFile = "src/Day1.txt";
        Day1 obj = new Day1(inputFile);
        obj.runIt();


    }
}

