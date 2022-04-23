import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) throws IOException{
        File file = new File("C:/Users/Hp/downloads/Lab Broker_Cyber_-1@^_1622921833637.log");

        Scanner scan = new Scanner(file);

        System.out.println(scan.nextLine());

        String filecontents = "";

        while(scan.hasNext()){
            filecontents = filecontents.concat(scan.next() + "\n");
        }

        try (FileWriter writer = new FileWriter("newfile.txt")) {
            writer.write(filecontents);
            writer.close();
        }




    }
}
