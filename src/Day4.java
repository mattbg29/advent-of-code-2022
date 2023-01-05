import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day4 {
    BufferedReader input;
    String letters = ".abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";


    Day4(String inputfile) throws FileNotFoundException {
        input = new BufferedReader(new FileReader(inputfile));
    }

    public void runIt() throws IOException {
        int total = 0;
        String line = input.readLine();
        while (line != null) {
            String[] lineNow = line.split(",");
            String[] left = lineNow[0].split("-");
            String[] right = lineNow[1].split("-");
            if (Integer.parseInt(left[0]) <= Integer.parseInt(right[0]) && Integer.parseInt(left[1]) >= Integer.parseInt(right[1])) {
                total++;
            } else if (Integer.parseInt(left[0]) >= Integer.parseInt(right[0]) && Integer.parseInt(left[1]) <= Integer.parseInt(right[1])) {
                total++;
            }
            line = input.readLine();
        }
        System.out.println(total);
    }

    public void runIt2() throws IOException {
        int total = 0;
        String line = input.readLine();
        while (line != null) {
            String[] lineNow = line.split(",");
            String[] left = lineNow[0].split("-");
            String[] right = lineNow[1].split("-");
            if (Integer.parseInt(left[0]) < Integer.parseInt(right[0]) && Integer.parseInt(left[1]) < Integer.parseInt(right[0])) {
                //total++;
            } else if (Integer.parseInt(left[0]) > Integer.parseInt(right[1]) && Integer.parseInt(left[1]) > Integer.parseInt(right[1])) {
                //total++;
            } else {
                total++;
            }
            line = input.readLine();
        }
        System.out.println(total);
    }


    public static void main(String[] args) throws IOException {
        String inputFile = "src/Day4.txt";
        Day4 obj = new Day4(inputFile);
        obj.runIt2();


    }
}

