import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day3 {
    BufferedReader input;
    String letters = ".abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";


    Day3(String inputfile) throws FileNotFoundException {
        input = new BufferedReader(new FileReader(inputfile));
    }

    public void runIt() throws IOException {
        int total = 0;
        String line = input.readLine();
        while (line != null) {
            int curLen = line.length();
            for (int i = 0; i < curLen / 2; i++) {
                for (int j = curLen / 2; j < curLen; j++) {
                    if (line.charAt(i) == line.charAt(j)) {
                        //System.out.println(line.charAt(i));
                        total += letters.indexOf(line.charAt(i));
                        i = curLen;
                        j = curLen;
                    }
                }
            }
            line = input.readLine();
        }
        System.out.println(total);
    }

    public void runIt2() throws IOException {
        int total = 0;
        String line1 = input.readLine();
        String line2 = input.readLine();
        String line3 = input.readLine();
        while (line1 != null) {
            for (int i = 0; i < line1.length(); i++) {
                for (int j = 0; j < line2.length(); j++) {
                    if (line1.charAt(i) == line2.charAt(j)) {
                        for (int k = 0; k < line3.length(); k++) {
                            if (line1.charAt(i) == line3.charAt(k)) {
                                //System.out.println(line1.charAt(i));
                                total += letters.indexOf(line1.charAt(i));
                                i = line1.length();
                                j = line2.length();
                                k = line3.length();
                            }
                        }
                    }
                }
            }
            line1 = input.readLine();
            line2 = input.readLine();
            line3 = input.readLine();
        }
        System.out.println(total);
    }


    public static void main(String[] args) throws IOException {
        String inputFile = "src/Day3.txt";
        Day3 obj = new Day3(inputFile);
        obj.runIt2();


    }
}

