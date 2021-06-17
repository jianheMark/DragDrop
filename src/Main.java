import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();

        main.readFile("text.txt");
        MyFrame myFrame = new MyFrame();
        //System.out.println(Main.class.getResource("/resources/elephant.png"));
    }
    public void readFile(String fileName) throws IOException {
        InputStream source = Main.class.getResourceAsStream("text.txt");
        Scanner scanner = new Scanner(source);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
