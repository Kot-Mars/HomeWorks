import java.io.*;
import java.util.Scanner;

public class Main {
    public static void ReaderFile(File file) {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if(file.createNewFile()) {
                System.out.println("File создан " + file.getName());
            } else {
                System.out.println("File уже создан " + file.getName());
            }
            Scanner scan = new Scanner(System.in);
            FileWriter writer = new FileWriter(file);
            System.out.print("Введите текст: ");
            writer.write(scan.nextLine());
            writer.close();
            scan.close();
            ReaderFile(file);
        } catch (IOException e) {
            e.getMessage();
        }

    }


}