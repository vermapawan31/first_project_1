package IOfileOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileOperation {

    public static void main(String[] args) throws IOException {
        Files.list(Paths.get(".")).forEach(e-> System.out.println(e));
    }
}
