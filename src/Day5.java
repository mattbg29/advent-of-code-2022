import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day5 {
    BufferedReader input;
    String letters = ".abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    ArrayList<ArrayList<String>> towers = new ArrayList<>();
    String[][] towerItems = {{"B", "L", "D", "T", "W", "C", "F", "M"},
            {"N", "B", "L"},
            {"J", "C", "H", "T", "L", "V"},
            {"S", "P", "J", "W"},
            {"Z", "S", "C", "F", "T", "L", "R"},
            {"W", "D", "G", "B", "H", "N", "Z"},
            {"F", "M", "S", "P", "V", "G", "C", "N"},
            {"W", "Q", "R", "J", "F", "V", "C", "Z"},
            {"R", "P", "M", "L", "H"}
    };

    Day5(String inputfile) throws FileNotFoundException {
        input = new BufferedReader(new FileReader(inputfile));
        for (int i = 0; i < towerItems.length; i++) {
            towers.add(new ArrayList<>());
            for (int j = 0; j < towerItems[i].length; j++) {
                towers.get(i).add(towerItems[i][j]);
            }
        }
    }

    public void runIt() throws IOException {
        int total = 0;
        String line = input.readLine();
        while (line != null) {
            String[] lineNow = line.split(" ");
            int moveCount = Integer.parseInt(lineNow[1]);
            int startTower = Integer.parseInt(lineNow[3]) - 1;
            int endTower = Integer.parseInt(lineNow[5]) - 1;
            //System.out.println(towers.get(0).get(0));
            for (int i = 0; i < moveCount; i++) {
                towers.get(endTower).add(towers.get(startTower).remove(towers.get(startTower).size() - 1));
            }
            line = input.readLine();
        }
        for (int i = 0; i < towers.size(); i++) {
            System.out.println(towers.get(i).get(towers.get(i).size() - 1));
        }
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
        String inputFile = "src/Day5.txt";
        Day5 obj = new Day5(inputFile);
        obj.runIt();


    }
}

