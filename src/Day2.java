import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {
    BufferedReader input;

    Day2(String inputfile) throws FileNotFoundException {
        input = new BufferedReader(new FileReader(inputfile));
    }

    public void runIt() throws IOException {
        String line = input.readLine();
        int total = 0;
        while (line != null) {
            switch (line) {
                case "A X":
                    total += 3;
                    break;
                case "A Y":
                    total += 4;
                    break;
                case "A Z":
                    total += 8;
                    break;
                case "B X":
                    total += 1;
                    break;
                case "B Y":
                    total += 5;
                    break;
                case "B Z":
                    total += 9;
                    break;
                case "C X":
                    total += 2;
                    break;
                case "C Y":
                    total += 6;
                    break;
                case "C Z":
                    total += 7;
                    break;

            }
            line = input.readLine();
        }
        System.out.println(total);
    }

    public static void main(String[] args) throws IOException {
        String inputFile = "src/Day2.txt";
        Day2 obj = new Day2(inputFile);
        obj.runIt();


    }
}

