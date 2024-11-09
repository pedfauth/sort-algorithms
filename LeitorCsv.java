import java.nio.file.*;
import java.util.*;
import java.io.IOException;

public class LeitorCsv {
    public static int[] readCSV(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        
        if (lines.get(0).contains("Value")) {
            lines.remove(0);
        }

        return lines.stream().mapToInt(Integer::parseInt).toArray();
    }
}