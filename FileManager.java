import java.io.*;

/**
 * Handles file saving
 */
public class FileManager {

    public static void save(String data){

        try(FileWriter fw = new FileWriter("attendance.txt", true)){

            fw.write(data + "\n");

        }catch(IOException e){

            System.out.println("Error writing file");

        }
    }
}